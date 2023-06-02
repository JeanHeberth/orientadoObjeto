package org.example.condicional;

public class Condicional {
    public static void main(String[] args) {
        String nomeDoFilme = "Top Gun Maverick";
        int anodoLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 36;
        String tipoDoPlano = "Plus";

        if (nomeDoFilme.equalsIgnoreCase("Top Gun Maverick")) {
            if (!(incluidoNoPlano || tipoDoPlano.equalsIgnoreCase("PLUS"))) {
                System.out.println("Fora do plano");
            } else if (notaDoFilme < 7) {
                System.out.println("Nota inferior a necessitada");
            } else if (anodoLancamento < 2022) {
                System.out.println("Filme retro");
            } else {
                System.out.println("Filme disponivel para locacao");
            }
        } else {
            System.out.println("Nao disponivel");
        }
    }
}


