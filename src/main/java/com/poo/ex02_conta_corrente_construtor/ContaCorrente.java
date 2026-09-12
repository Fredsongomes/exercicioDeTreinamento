package com.poo.ex02_conta_corrente_construtor;

public class ContaCorrente {
    private int numeroConta;
    private String correntista;
    private double saldo;

    public ContaCorrente(int numeroConta, String correntista) {
        this(numeroConta, correntista, 0.0);
    }

    public ContaCorrente(int numeroConta, String correntista, double saldo) {
        this.numeroConta = numeroConta;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getCorrentista() {
        return correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void alterarNome(String novoNome) {
        this.correntista = novoNome;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void saque(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
        }
    }

    public void imprimirDados() {
        System.out.println("Conta: " + numeroConta);
        System.out.println("Correntista: " + correntista);
        System.out.println("Saldo: R$ " + saldo);
    }
}
