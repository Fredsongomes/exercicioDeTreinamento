package com.poo.ex07_funcionario_salario_anual;

public class Funcionario {
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Funcionario(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        setSalarioMensal(salarioMensal);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
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
}
