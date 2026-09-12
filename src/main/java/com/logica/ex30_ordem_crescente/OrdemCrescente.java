package com.logica.ex30_ordem_crescente;

import java.util.Scanner;

public class OrdemCrescente {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, menor, meio, maior;

        System.out.print("Digite o primeiro valor: ");
        a = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        b = scanner.nextInt();

        System.out.print("Digite o terceiro valor: ");
        c = scanner.nextInt();

        menor = Math.min(a, Math.min(b, c));
        maior = Math.max(a, Math.max(b, c));
        meio = a + b + c - menor - maior;

        System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior);
    }
}
