package org.example.lacoDeRepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        double mediaAvaliacao = 0;
        double notaFilme = 0;
        int totalDeNotas = 0;
        DecimalFormat saida = new DecimalFormat("#0.00");

        Scanner sc = new Scanner(System.in);

        while (notaFilme != -1) {
            System.out.println("Diga sua avaliacao do filme de 0 a 10, e digite -1 para encerrar");
            notaFilme = sc.nextDouble();
           if (notaFilme != -1) {
                mediaAvaliacao += notaFilme;
                totalDeNotas++;
            }
        }
        System.out.println("Media de avaliacoes: "
                + saida.format(mediaAvaliacao / totalDeNotas))
        ;
    }

}
