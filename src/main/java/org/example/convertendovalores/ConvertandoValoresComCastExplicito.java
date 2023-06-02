package org.example.convertendovalores;

public class ConvertandoValoresComCastExplicito {
    public static void main(String[] args) {
        double media = (9.8 + 6.3 + 8.0) / 3;
        int classificacao;

        classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}
