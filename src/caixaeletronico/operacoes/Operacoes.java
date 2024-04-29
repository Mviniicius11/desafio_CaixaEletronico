package caixaeletronico.operacoes;

import caixaeletronico.clientes.Clientes;

import java.util.Scanner;

public class Operacoes {

    Clientes cliente1 = new Clientes();
    Scanner leitura = new Scanner(System.in);


    public void exibeSaldo(double saldo){

        System.out.println("Saldo atualizado R$ %.2f\n".formatted(saldo));
    }


    public void recebeValores(){

        System.out.println("Informe o valor a receber: ");
        double valor = leitura.nextDouble() + cliente1.getSaldo();



        System.out.println(valor);
    }
}
