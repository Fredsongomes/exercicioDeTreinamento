package com.poo.ex011_ingresso_heranca;

public class IngressoVip extends Ingresso {
    private double valorAdicional;

    public IngressoVip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorTotal() {
        return valor + valorAdicional;
    }

    @Override
    public void imprimirValor() {
        System.out.println("Valor do ingresso VIP (com adicional): R$ " + getValorTotal());
    }
}
