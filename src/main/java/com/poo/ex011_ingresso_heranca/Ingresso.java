package com.poo.ex011_ingresso_heranca;

public class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void imprimirValor() {
        System.out.println("Valor do ingresso: R$ " + valor);
    }
}
