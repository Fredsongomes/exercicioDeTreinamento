package com.poo.ex013_calculadora_heranca;

public class CalculadoraCientifica extends Calculadora{
    public double raizQuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
