package org.example.desafios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        double mediaAvaliacao = 0;
        double notaFilme = 0;
        double mediaFinal = 0;
        DecimalFormat saida = new DecimalFormat("#0.00");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliacao do filme: ");
            notaFilme = sc.nextDouble();
            mediaAvaliacao = mediaAvaliacao + notaFilme;
            mediaFinal = mediaAvaliacao / 3;
        }
        // < 5 baixo
        // 5 a 7 medio
        // 8 a 10 Excelente
        if (mediaFinal <= 5) {
            System.out.println("Media de avaliacao: baixa " + saida.format(mediaFinal));
        } else if (mediaFinal > 5 && mediaFinal < 8) {
            System.out.println("Media de avaliacao: media " + saida.format(mediaFinal));
        } else {
            System.out.println("Media de avaliacao: Excelente " + saida.format(mediaFinal));
        }
    }

}
