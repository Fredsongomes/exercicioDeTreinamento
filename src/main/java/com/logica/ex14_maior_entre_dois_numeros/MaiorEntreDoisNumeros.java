package com.logica.ex14_maior_entre_dois_numeros;

import java.util.Scanner;

public class MaiorEntreDoisNumeros {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }
    }
}
