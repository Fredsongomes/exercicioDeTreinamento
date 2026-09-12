package com.logica.ex13_numero_maior_que_dez;

import java.util.Scanner;

public class NumeroMaiorQueDez {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextDouble();

        if (numero > 10) {
            System.out.println("O número é maior que 10!");
        }
    }
}
