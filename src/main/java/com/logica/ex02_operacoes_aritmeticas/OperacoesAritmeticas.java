package com.logica.ex02_operacoes_aritmeticas;

import java.util.Scanner;

public class OperacoesAritmeticas {

    static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero1 = leitura.nextDouble();

        System.out.println("Digite outro número: ");
        double numero2 = leitura.nextDouble();

        double soma = numero1 + numero2;
        System.out.println("A soma é: " + soma);

        double subtracao = numero1 - numero2;
        System.out.println("A subtração é: " + subtracao);

        double multiplicacao = numero1 * numero2;
        System.out.println("A multiplicação é: " + multiplicacao);

        double divisao = numero1 / numero2;
        System.out.println("A divisão é: " + divisao);

    }
}
