package org.example.entradadedados;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a tempreatura em Celsius ");
        double temperaturaCelsius = sc.nextDouble();
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A temperatura Celsius convertida em Fahrenheit é: " +temperaturaFahrenheit);
        int conversaoTemperaturaParaInteiro = (int) temperaturaFahrenheit;
        System.out.println("A temperatura fahrenheit convertida em inteiro é: "+conversaoTemperaturaParaInteiro);


    }
}
