package com.logica.ex12_calculo_custo_carro;

import java.util.Scanner;

public class CustoCarro {
    static void main(String[] args) {

        final double PERCENTUAL_IMPOSTOS = 0.45;
        final double PERCENTUAL_DISTRIBUIDOR = 0.28;
        double custoFabrica, custoComImpostos, custoConsumidor;

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        custoFabrica = leitura.nextDouble();

        custoComImpostos = custoFabrica + (custoFabrica * PERCENTUAL_IMPOSTOS);
        custoConsumidor = custoComImpostos + (custoComImpostos * PERCENTUAL_DISTRIBUIDOR);

        System.out.println("Custo ao consumidor: " + custoConsumidor);
    }
}
