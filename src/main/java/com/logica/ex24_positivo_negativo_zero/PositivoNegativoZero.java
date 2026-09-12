package com.logica.ex24_positivo_negativo_zero;

import java.util.Scanner;

public class PositivoNegativoZero {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double numero;

        System.out.print("Digite quantos números deseja informar (N): ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            numero = scanner.nextDouble();

            if (numero > 0) {
                System.out.println("Positivo");
            } else if (numero < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }
    }
}
