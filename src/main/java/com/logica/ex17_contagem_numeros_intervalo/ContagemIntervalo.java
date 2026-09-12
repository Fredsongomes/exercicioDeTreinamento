package com.logica.ex17_contagem_numeros_intervalo;

import java.util.Scanner;

public class ContagemIntervalo {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_NUMEROS = 80;
        double numero;
        int contador = 0;

        for (int i = 1; i <= TOTAL_NUMEROS; i++) {
            System.out.print("Digite o número " + i + ": ");
            numero = scanner.nextDouble();

            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }

        System.out.println("Quantidade de números no intervalo [10, 150]: " + contador);
    }
}
