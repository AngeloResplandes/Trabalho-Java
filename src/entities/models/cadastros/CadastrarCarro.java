package entities.models.cadastros;

import entities.models.Carro;
import entities.models.Cor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastrarCarro {

    public static Carro cadastrarCarro() throws ParseException {
        String modelo;
        String placa;
        String cor;
        Integer ano;
        Date dataAquisicao;
        String data;
        String padrao = "dd/MM/yyyy";  
        SimpleDateFormat dateFormat = new SimpleDateFormat(padrao);

        Cor corEscolhida = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o modelo do veiculo:");
        modelo = sc.nextLine();

        System.out.println("Insira a placa do veiculo:");
        placa = sc.nextLine();

        System.out.println("Insira a cor do veiculo 'branca, preta, cinza ou vermelha':");
        cor = sc.nextLine();
        switch (cor) {
            case "branca":
                corEscolhida = Cor.branca;
                break;
            case "preta":
                corEscolhida = Cor.preta;
                break;
            case "cinza":
                corEscolhida = Cor.cinza;
                break;
            case "vermelha":
                corEscolhida = Cor.vermelha;
                break;
            default:
                System.out.println("Cor incompativel!");
        }

        System.out.println("Insira o ano do veiculo:");
        ano = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Insira a data de aquisição do veiculo (dia/mes/ano):");
        data = sc.next();  
        dataAquisicao = dateFormat.parse(data);

        return new Carro(modelo, placa, corEscolhida, ano, dataAquisicao);
    }
}
