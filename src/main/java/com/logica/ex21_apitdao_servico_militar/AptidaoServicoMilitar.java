package com.logica.ex21_apitdao_servico_militar;

import java.util.Scanner;

public class AptidaoServicoMilitar {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, idade;
        String nome, sexo, saude;
        int totalAptos = 0, totalNaoAptos = 0;

        System.out.print("Digite quantas pessoas serão cadastradas (N): ");
        n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("--- Pessoa " + i + " ---");

            System.out.print("Nome: ");
            nome = scanner.nextLine();

            System.out.print("Sexo (M/F): ");
            sexo = scanner.nextLine();

            System.out.print("Idade: ");
            idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Saúde (Boa/Ruim): ");
            saude = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M") && idade >= 18 && saude.equalsIgnoreCase("Boa")) {
                System.out.println(nome + " está APTA para o serviço militar obrigatório.");
                totalAptos++;
            } else {
                System.out.println(nome + " NÃO está apta para o serviço militar obrigatório.");
                totalNaoAptos++;
            }
        }

        System.out.println("Total de aptos: " + totalAptos);
        System.out.println("Total de não aptos: " + totalNaoAptos);
    }
}
