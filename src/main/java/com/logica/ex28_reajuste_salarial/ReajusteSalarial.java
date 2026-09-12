package com.logica.ex28_reajuste_salarial;

import java.util.Scanner;

public class ReajusteSalarial {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome;
        double salario;
        double novoSalario = 0;
        double aumentoSalarial;
        double salarioMinimo = 1621;
        int qtdFuncionarios = 584;
        double totalAumentoFolha = 0;

        final double AJUSTE_TRES_SALARIOS = 0.50;
        final double AJUSTE_TRES_A_DEZ_SALARIOS = 0.20;
        final double AJUSTE_ACIMA_DEZ_SALARIOS = 0.15;
        final double AJUSTE_DEMAIS_SALARIOS = 0.10;


        for (int i = 1; i <= qtdFuncionarios; i++) {
            System.out.println("Digite seu Nome: ");
            nome = leitura.nextLine();

            System.out.println("Digite seu salário: ");
            salario = leitura.nextDouble();
            leitura.nextLine();

            if (salario < (salarioMinimo * 3)) {
                aumentoSalarial = (salario * AJUSTE_TRES_SALARIOS);

            } else if (salario >= (salarioMinimo * 3) && salario <= (salarioMinimo * 10)) {
                aumentoSalarial = (salario * AJUSTE_TRES_A_DEZ_SALARIOS);

            } else if (salario > (salarioMinimo * 10) && salario <= (salarioMinimo * 20)) {
                aumentoSalarial = (salario * AJUSTE_ACIMA_DEZ_SALARIOS);

            } else {
                aumentoSalarial = (salario * AJUSTE_DEMAIS_SALARIOS);
            }

            novoSalario = salario + aumentoSalarial;

            System.out.println("Nome: " + nome);
            System.out.println("Valor do reajuste: " + aumentoSalarial);
            System.out.println("Novo salário: " + novoSalario);
            totalAumentoFolha += aumentoSalarial;
        }
    }
}
