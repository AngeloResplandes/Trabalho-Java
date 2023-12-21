package entities.models.cadastros;

import entities.models.Carro;
import entities.models.Cliente;
import entities.models.LocacaoDiaria;
import entities.models.LocacaoLongoPeriodo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RealizarLocacao {

    public static void locarCarro(Carro carro, Cliente cliente) throws ParseException {
        Date instanteLocacao;
        Date instanteDevolucao;
        Double valorDiaria;
        String padrao = "dd-MM-yyyy";

        SimpleDateFormat dateFormat = new SimpleDateFormat(padrao);
        Integer escolhaLocacao;
        int dias;
        Double porcentagemDesconto;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Insira a data de locação (dia-mes-ano):");
            instanteLocacao = dateFormat.parse(sc.nextLine());

            System.out.println("Insira a data de devolução (dia-mes-ano):");
            instanteDevolucao = dateFormat.parse(sc.nextLine());

            System.out.println("Insira o valor da locação:");
            valorDiaria = sc.nextDouble();

            System.out.println("Sua locação será diária (1) ou longo período (2), insira o número referente à locação?");
            escolhaLocacao = sc.nextInt();

            switch (escolhaLocacao) {
                case 1:
                    System.out.println("Insira os dias da locação:");
                    dias = sc.nextInt();
                    cliente.adicionarLocacao(new LocacaoDiaria(dias, instanteLocacao, instanteDevolucao, cliente, valorDiaria));
                    break;
                case 2:
                    System.out.println("Insira a porcentagem do desconto:");
                    porcentagemDesconto = sc.nextDouble();
                    cliente.adicionarLocacao(new LocacaoLongoPeriodo(porcentagemDesconto, instanteLocacao, instanteDevolucao, cliente, valorDiaria));
                    break;
                default:
                    System.out.println("Opção de locação inválida.");
                    break;
            }
        } catch (Exception e) { 
            System.out.println("Erro ao processar locação. Certifique-se de inserir dados válidos.");
        } finally {
            sc.close();
        }
    }
}
