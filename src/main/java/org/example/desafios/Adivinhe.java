package org.example.desafios;

import java.util.Random;
import java.util.Scanner;

public class Adivinhe {

    public static void main(String[] args) {
        int numero = 0;
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 5;
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < tentativas; i++) {
            System.out.println("Adivinhe qual numero entre 0 e 100 foi gerado: ");
            numero = sc.nextInt();

            if (numero > 0 && numero <= 100) {
                if (numero == numeroGerado) {
                    System.out.println("Voce acertou numero " + numeroGerado + " fim de jogo");
                    return;
                } else if (numero < numeroGerado) {
                    System.out.println("O numero informado é menor que o numero gerado, voce tem " +(tentativas - i - 1)+ " tentativas");
                } else {
                    System.out.println("O numero informado é maior que o numero gerado, voce tem " +(tentativas - i - 1)+ " tentativas");
                }
            } else {
                System.out.println("Numero inválido!");
            }
        }
            System.out.println("Voce nao tem mais tentativas o numero gerado era: " + numeroGerado);
        }
    }





