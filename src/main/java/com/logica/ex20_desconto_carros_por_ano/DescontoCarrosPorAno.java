package com.logica.ex20_desconto_carros_por_ano;

import java.util.Scanner;

public class DescontoCarrosPorAno {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;
        int ano, totalCarrosAte2000 = 0, totalCarros = 0;
        double valorVeiculo, desconto, valorPago, totalGeral = 0;

        do {
            System.out.print("Digite o ano do veículo: ");
            ano = scanner.nextInt();

            System.out.print("Digite o valor do veículo: ");
            valorVeiculo = scanner.nextDouble();

            if (ano <= 2000) {
                desconto = valorVeiculo * 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = valorVeiculo * 0.07;
            }

            valorPago = valorVeiculo - desconto;
            totalGeral += valorPago;
            totalCarros++;

            System.out.println("Valor do desconto: " + desconto);
            System.out.println("Valor a ser pago: " + valorPago);

            scanner.nextLine();
            System.out.print("Deseja continuar calculando? (S/N): ");
            continuar = scanner.nextLine();

        } while (!continuar.equalsIgnoreCase("N"));

        System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalCarros);
        System.out.println("Valor total geral pago: " + totalGeral);
    }
}
