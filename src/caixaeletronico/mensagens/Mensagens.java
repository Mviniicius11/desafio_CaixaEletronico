package caixaeletronico.mensagens;

import java.util.Scanner;

public class Mensagens {


    Scanner leitura = new Scanner(System.in);


    public void exibeMensagemNovaOperacao() {

        System.out.println("""
                Deseja realizar nova operação?
    
                1- Sim
                2- Não
    
                """);
    }


    public void exibeMensagemSaida() {
        System.out.println("Obrigado por utilizar nosso serviços. \nVolte sempre!");
    }


    public void exibeTelaInicial(String nome, String tipoConta, double saldo) {

        System.out.println("""
                **************************
                Dados iniciais do cliente:

                Nome: %s
                Tipo conta: %s
                Saldo: R$ %.2f
                **************************

                """.formatted(nome, tipoConta, saldo));
    }


    public void exibeMenu() {
        System.out.println("""
                Operações

                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair

                Digite a opção desejada:

                """);
    }


    public void exibeSaldoInsuficiente(){
        System.out.println("Não há saldo suficiente para fazer essa transferência.\n");
    }
}

