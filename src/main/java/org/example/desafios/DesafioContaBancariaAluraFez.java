package org.example.desafios;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioContaBancariaAluraFez {
    public static void main(String[] args) {
        String nome = "Jean Heberth";
        String tipoConta = "Corrente";
        int opcao = 0;
        float saldo = 1500;
        DecimalFormat dateFormat = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);


        System.out.println("******************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("\nTipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n****************************");

        String menu = """
                ** Digite a sua opcao **
                1 - Consultar Saldo
                2 - Transferir  valor
                3 - Receber valor
                4 - Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor desejado para transferencia?");
                double valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("Tranferencia realizada com sucesso! Seu valor atual e: " + dateFormat.format(saldo));
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser depositado ");
                double valor = sc.nextFloat();
                saldo += valor;
                System.out.println(" O valor atual é de: " + dateFormat.format(saldo));
            } else if (opcao != 4) {
                System.out.println("Opcao inválida");
            }
        }
    }
}


