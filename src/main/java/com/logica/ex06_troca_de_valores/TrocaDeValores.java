package com.logica.ex06_troca_de_valores;

import java.util.Scanner;

public class TrocaDeValores {

    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double a, b, aux;

        System.out.print("Digite o valor de A: ");
        a = leitura.nextDouble();

        System.out.print("Digite o valor de B: ");
        b = leitura.nextDouble();

        // Troca usando variável auxiliar
        aux = a;
        a = b;
        b = aux;

        System.out.println("Valor de A trocado: " + a);
        System.out.println("Valor de B trocado: " + b);

    }
}
