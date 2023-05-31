package org.example.formatacaoDeCaracteres;

public class formatter {
    public static void main(String[] args) {
        String nome = "Jean Heberth Souza Vieira";
        int idade = 35;
        double valor = 60.000;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos, e hoje gastei %.2f reais", nome, idade, valor));

    }
}
