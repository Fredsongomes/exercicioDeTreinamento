package com.poo.ex010_jogador_futebol;

import java.time.LocalDate;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Rafael Costa", "Atacante",
                LocalDate.of(1998, 3, 20), "Brasileira", 1.82, 78.0);

        Jogador jogador2 = new Jogador("Bruno Martins", "Defesa",
                LocalDate.of(1990, 7, 5), "Portuguesa", 1.88, 84.0);

        jogador1.imprimirDados();
        System.out.println();
        jogador2.imprimirDados();
    }
}
