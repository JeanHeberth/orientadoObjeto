package org.example.desafios;

public class ConvertendoDeCelsiusParaFahrenheit {
    public static void main(String[] args) {
        double temperaturaCelsius = 38;
        int fahrenheit = (int) (temperaturaCelsius * 1.8) + 32;
        System.out.println(String.format("A temperatura em Fahrenheit em número inteiro é: " +fahrenheit));


    }
}
