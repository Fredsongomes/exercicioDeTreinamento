package com.poo.ex012_agenda_array_objetos;

public class AgendaTeste {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.armazenarPessoa("Lucas Ferreira", 28, 1.75f);
        agenda.armazenarPessoa("Camila Souza", 34, 1.65f);
        agenda.armazenarPessoa("Rodrigo Lima", 22, 1.80f);
        agenda.armazenarPessoa("Fredson Junior", 20, 1.70f);

        System.out.println("--- Agenda completa ---");
        agenda.imprimirAgenda();

        System.out.println("\nPosição de 'Camila Souza': " + agenda.buscarPessoa("Camila Souza"));

        System.out.println("\n--- Imprimindo pessoa na posição 0 ---");
        agenda.imprimirPessoa(0);

        agenda.removerPessoa("Lucas Ferreira");

        System.out.println("\n--- Agenda após remover Lucas Ferreira ---");
        agenda.imprimirAgenda();

        System.out.println("\n--- Agenda após adicionar Fredson Junior");
        agenda.imprimirAgenda();
    }
}
