package com.logica.ex15_numero_no_intervalo;

import java.util.Scanner;

public class NumeroNoIntervalo {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O número NÃO está no intervalo entre 100 e 200.");
        }
    }
}
