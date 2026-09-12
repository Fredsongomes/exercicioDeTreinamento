package com.logica.ex25_comparacao_dois_numeros;

import java.util.Scanner;

public class ComparacaoDoisNumeros {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            if (num1 > num2) {
                System.out.println("O maior número é: " + num1);
            } else {
                System.out.println("O maior número é: " + num2);
            }
        }
    }
}
