package com.logica.ex04_salario_vendedor_comissao;

import java.util.Scanner;

public class SalarioVendedor {
    static void main(String[] args) {

        String nome;
        double salarioFixo = 0;
        double salarioFinal;
        int totalVendas;
        double comissao;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leitura.nextLine();

        System.out.println("Digite seu salário fixo: ");
        salarioFixo = leitura.nextDouble();

        System.out.println("Digite a quantidade de venda no mês: ");
        totalVendas = leitura.nextInt();

        comissao = totalVendas * 0.15;
        salarioFinal = salarioFixo + comissao;

        System.out.println("Nome: "+nome);
        System.out.println("Salário Fixo: "+ salarioFixo);
        System.out.println("Salário Final com comissão: " + salarioFinal);
    }
}
