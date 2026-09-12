package com.logica.ex23_condicoes_negativo_zero;

import java.util.Scanner;

public class CondicoesNegativoZero {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextDouble();

        if (numero > 80) {
            System.out.println("O número é maior que 80.");
        } else if (numero < 25) {
            System.out.println("O número é menor que 25.");
        } else if (numero == 40) {
            System.out.println("O número é igual a 40.");
        } else {
            System.out.println("O número não se enquadra em nenhuma das condições.");
        }

    }
}
