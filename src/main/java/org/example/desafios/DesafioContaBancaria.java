package org.example.desafios;

import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {

        int opcao;
        float saldo = 15000, deposito = 0, transferir = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("******************");
            System.out.println("1- Consultar saldo ");
            System.out.println("2- Receber valor ");
            System.out.println("3- Tranferir valor");
            System.out.println("4- Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo disponível na conta: " + saldo);
                    break;

                case 2:
                    System.out.println("Informe qunato deseja depositar ");
                    deposito = sc.nextFloat();
                    System.out.println("Deposito no valor: "+deposito+  " realizado com sucesso!" +
                            "o seu saldo atualizado é de: " +(saldo + deposito));
                    break;

                case 3:
                    System.out.println("Informe qunato deseja transferir ");
                    transferir = sc.nextFloat();
                    System.out.println("Transferencia no valor: "+transferir+  " realizado com sucesso!" +
                            "o seu saldo atualizado é de: "  +(saldo - transferir) );
                    break;

            }
        }
        while (opcao != 4);
        System.out.println("Opcao inválida!");
    }
}


