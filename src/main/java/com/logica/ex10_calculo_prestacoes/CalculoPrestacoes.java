package com.logica.ex10_calculo_prestacoes;

import java.util.Scanner;

public class CalculoPrestacoes {
    static void main(String[] args) {

        double valorCompra;
        double valorPrestacoes;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        valorCompra = leitura.nextDouble();

         valorPrestacoes = valorCompra / 5;

        System.out.println("O valor da prestações é : " + valorPrestacoes);
    }
}
