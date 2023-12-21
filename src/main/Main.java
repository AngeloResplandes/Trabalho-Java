package main;

import entities.models.cadastros.RealizarLocacao;
import entities.models.cadastros.CadastrarSede;
import entities.models.cadastros.CadastrarCliente;
import entities.models.cadastros.CadastrarCarro;
import entities.models.*;
import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        Sede sede = null;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    sede = cadastrarSede(scanner);
                    break;
                case 2:
                    cadastrarCliente(scanner, sede);
                    break;
                case 3:
                    cadastrarCarro(scanner, sede);
                    break;
                case 4:
                    realizarLocacao(scanner, sede);
                    break;
                case 5:
                    exibirInformacoesSede(sede);
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Cadastrar Sede");
        System.out.println("2. Cadastrar Cliente");
        System.out.println("3. Cadastrar Carro");
        System.out.println("4. Realizar Locação");
        System.out.println("5. Exibir Informações da Sede");
        System.out.println("0. Sair");
        System.out.println("Escolha uma opção:");
    }

    private static Sede cadastrarSede(Scanner scanner) {
        System.out.println("=== Cadastrar Sede ===");
        Sede novaSede = CadastrarSede.cadastrarSede();

        System.out.println("Sede cadastrada com sucesso!");
        return novaSede;
    }

    private static void cadastrarCliente(Scanner scanner, Sede sede) {
        if (sede != null) {
            Cliente cliente = CadastrarCliente.cadastrarCliente();
            sede.adicionarCliente(cliente);
            System.out.println("Cliente cadastrado na sede " + sede.getId() + " com sucesso!");
        } else {
            System.out.println("Antes de cadastrar um cliente, é necessário cadastrar uma sede.");
        }
    }

    private static void cadastrarCarro(Scanner scanner, Sede sede) {
        if (sede != null) {
            try {
                Carro carro = CadastrarCarro.cadastrarCarro();
                sede.adicionarCarro(carro);
                System.out.println("Carro cadastrado na sede " + sede.getId() + " com sucesso!");
            } catch (ParseException e) {
                System.out.println("Erro ao cadastrar carro. Certifique-se de inserir dados válidos.");
            }
        } else {
            System.out.println("Antes de cadastrar um carro, é necessário cadastrar uma sede.");
        }
    }

    private static void realizarLocacao(Scanner scanner, Sede sede) {
        if (sede != null) {
            try {
                System.out.println("=== Realizar Locação ===");
                Carro carro = CadastrarCarro.cadastrarCarro();
                Cliente cliente = CadastrarCliente.cadastrarCliente();
                RealizarLocacao.locarCarro(carro, cliente);
                System.out.println("Locação realizada na sede " + sede.getId() + " com sucesso!");
            } catch (ParseException e) {
                System.out.println("Erro ao realizar locação. Certifique-se de inserir dados válidos.");
            }
        } else {
            System.out.println("Antes de realizar uma locação, é necessário cadastrar uma sede.");
        }
    }

    private static void exibirInformacoesSede(Sede sede) {
        if (sede != null) {
            System.out.println("=== Informações da Sede ===");
            System.out.println("ID da Sede: " + sede.getId());
            System.out.println("Localidade: " + sede.getLocalidade().toString());
            System.out.println("Endereço: " + sede.getEnderecoSede().toString());
            System.out.println("Nenhuma sede cadastrada.");
        }
    }

    private static void listarClientesSede(Sede sede) {
        System.out.println("=== Clientes cadastrados na Sede: ===");
        for (Cliente c : sede.getClientes()) {
            System.out.println(c.getNome() + " " + c.getCpf() + " " + c.getEmail());
        }
    }
}
