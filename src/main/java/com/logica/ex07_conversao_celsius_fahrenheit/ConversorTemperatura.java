package com.logica.ex07_conversao_celsius_fahrenheit;

import java.util.Scanner;

public class ConversorTemperatura {
    static void main(String[] args) {


        int temperaturaCelsius;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a temperatura em Graus Celsius: ");
        temperaturaCelsius = leitura.nextInt();

        int conversorTemperatura = (temperaturaCelsius * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " +conversorTemperatura);

    }
}
