import caixaeletronico.clientes.Clientes;
import caixaeletronico.mensagens.Mensagens;
import caixaeletronico.operacoes.Operacoes;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Clientes cliente1 = new Clientes();
        Mensagens mensagens = new Mensagens();
        Operacoes operacoes = new Operacoes();

        Scanner leitura = new Scanner(System.in);

        //Clientes

        cliente1.setNome("Jacqueline Oliveira");
        cliente1.setTipoConta("Corrente");
        cliente1.setNumeroConta(123456);
        cliente1.setSaldo(4600);

        int opcao = 0;
        int exit;

        mensagens.exibeTelaInicial(cliente1.getNome(), cliente1.getTipoConta(), cliente1.getSaldo());

        while (opcao != 4) {
            mensagens.exibeMenu();
            opcao = leitura.nextInt();

            if (opcao == 1) {

                operacoes.exibeSaldo(cliente1.getSaldo());

                mensagens.exibeMensagemNovaOperacao();
                exit = leitura.nextInt();

                if (exit == 2) {
                    mensagens.exibeMensagemSaida();
                    opcao = 4;
                }


            } else if (opcao == 2) {
                System.out.println("\nInforme o valor a receber: \n");
                double valor = leitura.nextDouble();
                cliente1.setSaldo(cliente1.getSaldo() + valor);

                operacoes.exibeSaldo(cliente1.getSaldo());

                mensagens.exibeMensagemNovaOperacao();
                exit = leitura.nextInt();

                if (exit == 2) {
                    mensagens.exibeMensagemSaida();
                    opcao = 4;
                }

            } else if (opcao == 3) {

                System.out.println("\nInforme o valor que deseja transferir: \n");
                double valor = leitura.nextDouble();

                if (cliente1.getSaldo() < valor) {

                    mensagens.exibeSaldoInsuficiente();


                } else {
                    cliente1.setSaldo(cliente1.getSaldo() - valor);
                    operacoes.exibeSaldo(cliente1.getSaldo());

                }

                mensagens.exibeMensagemNovaOperacao();
                exit = leitura.nextInt();

                if (exit == 2) {
                    mensagens.exibeMensagemSaida();
                    opcao = 4;
                }

            } else if (opcao == 4) {

                mensagens.exibeMensagemSaida();

            } else {
                mensagens.exibeOpcaoInvalida();
            }
        }
    }
}