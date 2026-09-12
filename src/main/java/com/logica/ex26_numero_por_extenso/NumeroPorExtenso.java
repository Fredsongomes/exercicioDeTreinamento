package com.logica.ex26_numero_por_extenso;

import java.util.Scanner;

public class NumeroPorExtenso {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 5: ");
        int numero = leitor.nextInt();

        switch (numero) {
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRÊS");
                break;
            case 4:
                System.out.println("QUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            default:
                System.out.println("número inválido");
                break;
        }
    }
}
