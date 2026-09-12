package com.poo.ex02_conta_corrente_construtor;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(1001, "Deborah Gomes");
        ContaCorrente c2 = new ContaCorrente(1002, "Fredson Junior", 500.0);

        System.out.println("--- Conta 1 (saldo default) ---");
        c1.imprimirDados();

        System.out.println("\n--- Conta 2 (saldo informado) ---");
        c2.imprimirDados();

        c1.deposito(300.0);
        c1.saque(50.0);
        c1.alterarNome("Carlos A. Souza");

        System.out.println("\n--- Conta 1 após operações ---");
        c1.imprimirDados();

        c2.saque(1000.0);
    }
}
