package com.logica.ex19_contagem_homens_e_mulheres;

import java.util.Scanner;

public class ContagemHomensMulheres {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_PESSOAS = 56;
        String nome, sexo;
        int totalHomens = 0, totalMulheres = 0;

        for (int i = 1; i <= TOTAL_PESSOAS; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            nome = scanner.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                System.out.println(nome + " é homem.");
                totalHomens++;
            } else {
                System.out.println(nome + " é mulher.");
                totalMulheres++;
            }
        }

        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
    }
}
