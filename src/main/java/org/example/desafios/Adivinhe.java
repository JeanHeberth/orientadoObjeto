package org.example.desafios;

import java.util.Random;
import java.util.Scanner;

public class Adivinhe {

    public static void main(String[] args) {
        int numero = 0;
        int numeroGerado = new Random().nextInt(100);
        int i;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.println("Adivinhe qual numero entre 0 e 100 vai cair?");
            numero = sc.nextInt();

            if (numero > 0 && numero <= 100) {
            }
            if (numero == numeroGerado) {
                System.out.println("O numero digitado está correto! " + numeroGerado);
                break;
            }
            if (numero != numeroGerado) {
                System.out.println("O numero digitado está incorreto! " + numeroGerado);
            }
            if (i == 5) {
                System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroGerado);
            }
//        } else{
//            System.out.println("Número inválido!");
        }
    }
}



   /* public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroGerado);
        }


    }
}

    */