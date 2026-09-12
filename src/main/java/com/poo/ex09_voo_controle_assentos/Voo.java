package com.poo.ex09_voo_controle_assentos;

public class Voo {
    private static final int MAX_PASSAGEIROS = 100;

    private int numeroVoo;
    private Data data;
    private boolean[] cadeiras;

    public Voo(int numeroVoo, Data data) {
        this.numeroVoo = numeroVoo;
        this.data = data;
        this.cadeiras = new boolean[MAX_PASSAGEIROS];
    }

    public int proximoLivre() {
        for (int i = 0; i < cadeiras.length; i++) {
            if (!cadeiras[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    public boolean verifica(int numeroCadeira) {
        return cadeiras[numeroCadeira - 1];
    }

    public boolean ocupa(int numeroCadeira) {
        if (verifica(numeroCadeira)) {
            return false;
        }
        cadeiras[numeroCadeira - 1] = true;
        return true;
    }

    public int vagas() {
        int livres = 0;
        for (boolean ocupada : cadeiras) {
            if (!ocupada) {
                livres++;
            }
        }
        return livres;
    }

    public int getVoo() {
        return numeroVoo;
    }

    public Data getData() {
        return data;
    }
}
