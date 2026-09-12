package com.logica.ex27_desconto_carros_combustivel;

import java.util.Scanner;

public class DescontoCarrosCombustivel {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double valorCarro;
        double valorDesconto = 0;
        double totalDescontos = 0;
        double valorApagar;
        double totalPago = 0;

        final double PERCENTUAL_DESCONTO_ALCOOL = 0.25;
        final double PERCENTUAL_DESCONTO_GASOLINA = 0.21;
        final double PERCENTUAL_DESCONTO_DIESEL = 0.14;



        System.out.println("Digite o valor do carro(0 para encerrar): ");
        valorCarro = leitor.nextDouble();

        leitor.nextLine();

        while (valorCarro != 0) {
            System.out.println("Qual o tipo de combustivel usado no carro digite: (1-Álcool  2-Gasolina 3-Diesel): ");
            String tipoCombustivel = leitor.nextLine();

            if (tipoCombustivel.equals("1") ) {
                valorDesconto = (valorCarro * PERCENTUAL_DESCONTO_ALCOOL);
            } else if (tipoCombustivel.equals("2")) {
                valorDesconto = (valorCarro * PERCENTUAL_DESCONTO_GASOLINA);
            } else if (tipoCombustivel.equals("3")) {
                valorDesconto = (valorCarro * PERCENTUAL_DESCONTO_DIESEL);
            } else {
                System.out.println("Tipo de combustível inválido! nenhum desconto aplicado. ");
            }

            valorApagar = valorCarro - valorDesconto;
            System.out.println("Valor do desconto: " + valorDesconto);
            System.out.println("Valor a pagar: " + valorApagar);

            totalDescontos += valorDesconto;
            totalPago += valorApagar;

            System.out.print("\nDigite o valor do carro (0 para encerrar): ");
            valorCarro = leitor.nextDouble();
            leitor.nextLine();
        }

        System.out.println("\n--- RESUMO FINAL ---");
        System.out.println("Total de descontos concedidos: " + totalDescontos);
        System.out.println("Total pago por todos os clientes: " + totalPago);
    }
}
