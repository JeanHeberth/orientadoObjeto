package org.example.lacoDeRepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        double mediaAvaliacao = 0;
        double notaFilme = 0;
        DecimalFormat saida = new DecimalFormat("#0.00");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliacao do filme: ");
            notaFilme = sc.nextDouble();
            mediaAvaliacao +=  notaFilme;

        }
        System.out.println("Media de avaliacoes: "
                +saida.format(mediaAvaliacao/3))
        ;
    }

}
