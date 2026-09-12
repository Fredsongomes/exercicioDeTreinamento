package com.logica.ex31_calculadora_operadores;

import java.util.Scanner;

public class CalculadoraOperadores {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, resultado;
        char c;

        System.out.print("Digite o valor de A: ");
        a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        b = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("Digite o operador (+, -, *, /): ");
        c = scanner.nextLine().charAt(0);

        switch (c) {
            case '+':
                resultado = a + b;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Erro: divisão por zero não é permitida.");
                } else {
                    resultado = a / b;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Operador não definido.");
        }
    }
}
