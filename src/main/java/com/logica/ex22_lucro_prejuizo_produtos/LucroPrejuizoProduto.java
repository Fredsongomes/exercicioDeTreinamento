package com.logica.ex22_lucro_prejuizo_produtos;

import java.util.Scanner;

public class LucroPrejuizoProduto {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        final int TOTAL_PRODUTOS = 40;
        double precoCusto, precoVenda;
        double somaCusto = 0, somaVenda = 0;

        for (int i = 1; i <= TOTAL_PRODUTOS; i++) {
            System.out.println("--- Produto " + i + " ---");

            System.out.print("Digite o preço de custo: ");
            precoCusto = leitura.nextDouble();

            System.out.print("Digite o preço de venda: ");
            precoVenda = leitura.nextDouble();

            System.out.println("Preço de custo: " + precoCusto);
            System.out.println("Preço de venda: " + precoVenda);

            if (precoVenda > precoCusto) {
                System.out.println("Resultado: Lucro");
            } else if (precoVenda < precoCusto) {
                System.out.println("Resultado: Prejuízo");
            } else {
                System.out.println("Resultado: Empate");
            }
            somaCusto += precoCusto;
            somaVenda += precoVenda;
        }

        System.out.println("Média de preço de custo: " + (somaCusto / TOTAL_PRODUTOS));
        System.out.println("Média de preço de venda: " + (somaVenda / TOTAL_PRODUTOS));
    }
}
