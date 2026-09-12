package com.logica.ex05_calculo_media_aluno;

import java.util.Scanner;

public class MediaAluno {
    static void main(String[] args) {

        String nome;
        double nota1;
        double nota2;
        double nota3;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        nome = leitura.nextLine();

        System.out.println("Digite a Primeira nota: ");
        nota1 = leitura.nextDouble();

        System.out.println("Digite a Segunda nota: ");
        nota2 = leitura.nextDouble();

        System.out.println("Digite a Terceira nota: ");
        nota3 = leitura.nextDouble();

        double mediaNotas = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas é: " + mediaNotas);
    }
}
