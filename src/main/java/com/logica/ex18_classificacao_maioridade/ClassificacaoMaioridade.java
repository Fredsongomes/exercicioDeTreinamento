package com.logica.ex18_classificacao_maioridade;

import java.util.Scanner;

public class ClassificacaoMaioridade {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int TOTAL_PESSOAS = 10;
        int idade;
        int contadorMaiorDeIdade = 0 ;
        int contadorMenorDeIdade = 0;
        for (int i = 1; i <= TOTAL_PESSOAS; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Maior de idade");
                contadorMaiorDeIdade++;
            } else {
                System.out.println("Menor de idade");
                contadorMenorDeIdade++;
            }
        }
        System.out.println("A quantidade pessoas Maior de idade é: " + contadorMaiorDeIdade);
        System.out.println("A quantidade pessoas Menor de idade é: " + contadorMenorDeIdade);

    }
}
