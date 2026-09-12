package com.poo.ex018_controle_remoto_encapsulamento;

public class ControleRemotoTeste {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
}
