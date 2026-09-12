package com.logica.ex03_calculo_consumo_medio;

import java.util.Scanner;

public class ConsumoMedio {
    static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int distanciaTotalPercorrida;
        int totalCombustivel;

        System.out.println("Digite o total da distância percorrida: ");
        distanciaTotalPercorrida = leitura.nextInt();

        System.out.println("Digite o total de combustível usado: ");
        totalCombustivel = leitura.nextInt();

        double consumoMedio = distanciaTotalPercorrida / totalCombustivel;

        System.out.println("A média de consumo do carro foi: "+ consumoMedio);
    }
}
