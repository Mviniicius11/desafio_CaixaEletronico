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

        cliente1.setNome("Jacqueline Oliveira");
        cliente1.setTipoConta("Corrente");
        cliente1.setSaldo(4600);
        double saldo = cliente1.getSaldo();
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
                System.out.println("Informe o valor a receber: ");
                double valor = leitura.nextDouble();
                cliente1.setSaldo(cliente1.getSaldo() + valor);

                System.out.println("Saldo atualizado R$ %.2f\n".formatted(cliente1.getSaldo()));

                mensagens.exibeMensagemNovaOperacao();
                exit = leitura.nextInt();

                if (exit == 2) {
                    mensagens.exibeMensagemSaida();
                    opcao = 4;
                }

            } else if (opcao == 3) {

                System.out.println("Informe o valor que deseja transferir: ");
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
                System.out.println("Opção inválida\n");
            }
        }
    }
}