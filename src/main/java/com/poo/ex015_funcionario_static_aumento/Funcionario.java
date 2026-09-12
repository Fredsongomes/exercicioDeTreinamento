package com.poo.ex015_funcionario_static_aumento;

public class Funcionario {
    private static int totalFuncionarios = 0;

    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        setSalarioMensal(salarioMensal);
        totalFuncionarios++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = (salarioMensal > 0) ? salarioMensal : 0.0;
    }

    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    // Variável de classe que contabiliza o número de funcionários criados até agora
    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }
}
