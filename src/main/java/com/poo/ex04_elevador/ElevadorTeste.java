package com.poo.ex04_elevador;

public class ElevadorTeste {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.inicializa(4, 10);

        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Capacidade: " + elevador.getCapacidade());

        elevador.entra();
        elevador.entra();
        elevador.entra();
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());

        elevador.sobe();
        elevador.sobe();
        System.out.println("Andar atual: " + elevador.getAndarAtual());

        elevador.sai();
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());

        elevador.desce();
        elevador.desce();
        elevador.desce();
        System.out.println("Andar atual: " + elevador.getAndarAtual());
    }
}
