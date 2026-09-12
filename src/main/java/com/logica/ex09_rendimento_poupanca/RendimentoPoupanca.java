package com.logica.ex09_rendimento_poupanca;

import java.util.Scanner;

public class RendimentoPoupanca {
    static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        final double TAXA_JUROS = 0.0007; // 0,07% ao mês
        double valorDepositado, rendimento, valorFinal;

        System.out.print("Digite o valor depositado: ");
        valorDepositado = leitura.nextDouble();

        rendimento = valorDepositado * TAXA_JUROS;
        valorFinal = valorDepositado + rendimento;

        System.out.println("Rendimento do mês: " + rendimento);
        System.out.println("Valor final após um mês: " + valorFinal);
    }
}
