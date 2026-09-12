package com.poo.ex014_fatura__getters_setters;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("NF-001", "Monitor 24 polegadas", 3, 899.90);
        Fatura fatura2 = new Fatura("NF-002", "Cabo HDMI", -2, -15.0);

        System.out.println("--- Fatura 1 ---");
        System.out.println("Número: " + fatura1.getNumero());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preço por item: R$ " + fatura1.getPrecoItem());
        System.out.println("Total da fatura: R$ " + fatura1.getTotalFatura());

        System.out.println("\n--- Fatura 2 ---");
        System.out.println("Número: " + fatura2.getNumero());
        System.out.println("Descrição: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Preço por item: R$ " + fatura2.getPrecoItem());
        System.out.println("Total da fatura: R$ " + fatura2.getTotalFatura());
    }
}
