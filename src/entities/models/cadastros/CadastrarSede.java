package entities.models.cadastros;

import entities.models.Cidade;
import entities.models.Endereco;
import entities.models.Estado;
import entities.models.Localidade;
import entities.models.Sede;
import java.util.Scanner;

public class CadastrarSede {

    public static Sede cadastrarSede() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a latitude da localidade:");
        double latitude = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insira a longitude da localidade:");
        double longitude = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insira o logradouro do endereço:");
        String logradouro = scanner.nextLine();

        System.out.println("Insira o número do endereço:");
        String numero = scanner.nextLine();

        System.out.println("Insira o complemento do endereço:");
        String complemento = scanner.nextLine();

        System.out.println("Insira o bairro do endereço:");
        String bairro = scanner.nextLine();

        System.out.println("Insira o cep do endereço:");
        String cep = scanner.nextLine();

        System.out.println("Insira a cidade do endereço:");
        String cidade = scanner.nextLine();

        System.out.println("Insira o estado do endereço:");
        String estado = scanner.nextLine();

        Localidade localidade = new Localidade(latitude, longitude);
        Cidade cidadeSede = new Cidade(cidade, new Estado(estado));
        Endereco enderecoSede = new Endereco(logradouro, numero, complemento, bairro, cep, cidadeSede);

        return new Sede(localidade, enderecoSede);
    }
}
