package com.poo.ex03_bomba_combustivel;

public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorPorLitro;
    private double quantidadeCombustivel; // estoque disponível na bomba (litros)

    public BombaCombustivel(String tipoCombustivel, double valorPorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public double abastecerPorValor(double valor) {
        double litros = valor / valorPorLitro;

        if (litros > quantidadeCombustivel) {
            System.out.println("Combustível insuficiente na bomba. Disponível: " + quantidadeCombustivel + " litros.");
            return 0;
        }

        quantidadeCombustivel -= litros;
        System.out.println("Quantidade de litros abastecida: " + litros);
        return litros;
    }

    public double abastecerPorLitro(double litros) {
        if (litros > quantidadeCombustivel) {
            System.out.println("Combustível insuficiente na bomba. Disponível: " + quantidadeCombustivel + " litros.");
            return 0;
        }

        double valorAPagar = litros * valorPorLitro;
        quantidadeCombustivel -= litros;
        System.out.println("Valor a ser pago: R$ " + valorAPagar);
        return valorAPagar;
    }

    public void alterarValor(double novoValor) {
        this.valorPorLitro = novoValor;
    }

    public void alterarCombustivel(String novoTipo) {
        this.tipoCombustivel = novoTipo;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getValorPorLitro() {
        return valorPorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
}
