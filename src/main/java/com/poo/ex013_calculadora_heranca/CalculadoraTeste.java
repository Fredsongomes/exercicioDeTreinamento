package com.poo.ex013_calculadora_heranca;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("--- Calculadora básica ---");
        System.out.println("Soma: " + calc.soma(10, 5));
        System.out.println("Subtração: " + calc.subtracao(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicacao(10, 5));
        System.out.println("Divisão: " + calc.divisao(10, 5));

        CalculadoraCientifica calcCientifica = new CalculadoraCientifica();

        System.out.println("\n--- Calculadora científica (herda da básica) ---");
        System.out.println("Soma: " + calcCientifica.soma(20, 4));
        System.out.println("Raiz quadrada de 81: " + calcCientifica.raizQuadrada(81));
        System.out.println("2 elevado a 10: " + calcCientifica.potencia(2, 10));
    }
}
