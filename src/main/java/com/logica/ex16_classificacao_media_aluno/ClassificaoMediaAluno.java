package com.logica.ex16_classificacao_media_aluno;

import java.util.Scanner;

public class ClassificaoMediaAluno {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome;
        double nota1, nota2, nota3, media;

        System.out.print("Digite o nome do aluno: ");
        nome = leitura.nextLine();

        System.out.print("Digite a primeira nota: ");
        nota1 = leitura.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = leitura.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = leitura.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else if (media <= 5) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Recuperação");
        }
    }
}
