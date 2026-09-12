package com.poo.ex016_carro_combustivel_distancia;

public class Carro {
    private static final double CAPACIDADE_TANQUE = 50;
    private static final double CONSUMO_KM_POR_LITRO = 15;

    private double combustivelAtual;
    private double distanciaTotal;

    public Carro() {
        this.combustivelAtual = 0;
        this.distanciaTotal = 0;
    }

    public void abastecer(double litros) {
        combustivelAtual += litros;

        if (combustivelAtual > CAPACIDADE_TANQUE) {
            System.out.println("Tanque cheio! Excedente descartado.");
            combustivelAtual = CAPACIDADE_TANQUE;
        }
    }

    public void mover(double distanciaKm) {
        double litrosNecessarios = distanciaKm / CONSUMO_KM_POR_LITRO;

        if (litrosNecessarios <= combustivelAtual) {
            combustivelAtual -= litrosNecessarios;
            distanciaTotal += distanciaKm;
        } else {
            double distanciaPossivel = combustivelAtual * CONSUMO_KM_POR_LITRO;
            distanciaTotal += distanciaPossivel;
            combustivelAtual = 0;
            System.out.println("Combustível insuficiente. O carro andou apenas " + distanciaPossivel + " km.");
        }
    }

    public double getCombustivelAtual() {
        return combustivelAtual;
    }

    public double getDistanciaTotal() {
        return distanciaTotal;
    }
}

