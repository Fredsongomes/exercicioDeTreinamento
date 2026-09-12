package com.poo.ex016_carro_combustivel_distancia;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.abastecer(20);
        carro2.abastecer(30);

        carro1.mover(200);
        carro2.mover(400);

        System.out.println("--- Carro 1 ---");
        System.out.println("Distância percorrida: " + carro1.getDistanciaTotal() + " km");
        System.out.println("Combustível restante: " + carro1.getCombustivelAtual() + " litros");

        System.out.println("\n--- Carro 2 ---");
        System.out.println("Distância percorrida: " + carro2.getDistanciaTotal() + " km");
        System.out.println("Combustível restante: " + carro2.getCombustivelAtual() + " litros");
    }
}
