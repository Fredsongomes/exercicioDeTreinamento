package com.poo.ex03_bomba_combustivel;

public class TesteBombaCombustivel {
    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.79, 1000.0);

        System.out.println("Tipo de combustível: " + bomba.getTipoCombustivel());
        System.out.println("Valor por litro: R$ " + bomba.getValorPorLitro());
        System.out.println("Estoque disponível: " + bomba.getQuantidadeCombustivel() + " litros");

        System.out.println("\n--- Abastecendo por valor (R$ 100,00) ---");
        bomba.abastecerPorValor(100.0);

        System.out.println("\n--- Abastecendo por litro (10 litros) ---");
        bomba.abastecerPorLitro(10.0);

        System.out.println("\nEstoque restante: " + bomba.getQuantidadeCombustivel() + " litros");

        bomba.alterarValor(6.09);
        bomba.alterarCombustivel("Etanol");
        bomba.alterarQuantidadeCombustivel(500.0);

        System.out.println("\n--- Após alterações ---");
        System.out.println("Tipo de combustível: " + bomba.getTipoCombustivel());
        System.out.println("Valor por litro: R$ " + bomba.getValorPorLitro());
        System.out.println("Estoque disponível: " + bomba.getQuantidadeCombustivel() + " litros");
    }
}
