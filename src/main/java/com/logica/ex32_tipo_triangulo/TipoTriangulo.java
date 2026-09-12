package com.logica.ex32_tipo_triangulo;

import java.util.Scanner;

public class TipoTriangulo {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int a, b, c;

        System.out.print("Digite o primeiro lado: ");
        a = leitura.nextInt();

        System.out.print("Digite o segundo lado: ");
        b = leitura.nextInt();

        System.out.print("Digite o terceiro lado: ");
        c = leitura.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isóscele");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }
    }
}
