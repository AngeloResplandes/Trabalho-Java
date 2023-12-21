package entities.models.cadastros;

import entities.models.Cliente;
import entities.models.Telefone;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastrarCliente {

    public static Cliente cadastrarCliente() {
        String nome;
        String email;
        String cpf; 
        String telefone;
        List<Telefone> telefones = new ArrayList<>();
        char verificacao;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserir nome do cliente:");
        nome = sc.nextLine();

        System.out.println("Inserir email do cliente:");
        email = sc.nextLine();

        System.out.println("Inserir CPF do cliente:");
        cpf = sc.nextLine();

        do {
            System.out.println("Inserir telefone do cliente:");
            telefone = sc.nextLine();
            telefones.add(new Telefone(telefone));

            System.out.println("Deseja inserir mais um telefone? 'S' ou 's' para continuar");
            verificacao = sc.nextLine().charAt(0);
        } while (verificacao == 'S' || verificacao == 's');

        return new Cliente(cpf, nome, email, telefones);
    }

}
