package caixaeletronico.mensagens;

public class Mensagens {


    public void exibeMensagemNovaOperacao() {

        System.out.println("""
                Deseja realizar nova operação?
    
                1- Sim
                2- Não
    
                """);
    }


    public void exibeTelaInicial(String nome, String tipoConta, double saldo) {

        System.out.println("""
                *************************************
                Dados do cliente:

                Nome: %s
                Tipo conta: %s
                Saldo: R$ %.2f                
                *************************************
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
        System.out.println("\nNão há saldo suficiente para fazer essa transferência.\n");
    }

    public void exibeClienteNaoLocalizado(){
        System.out.println("\nNúmero de conta não localizada! \n");
    }

    public void exibeOpcaoInvalida() {
        System.out.println("\nOpção inválida\n");
    }

    public void exibeMensagemSaida() {
        System.out.println("""
        
        Sessâo encerrada!
        Obrigado por utilizar nosso serviços.
        *************************************
        """);
    }
}

