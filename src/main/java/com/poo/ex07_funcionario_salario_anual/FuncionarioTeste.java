package com.poo.ex07_funcionario_salario_anual;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("João", "Souza", 3000.0);
        Funcionario func2 = new Funcionario("Ana", "Lima", 4500.0);

        System.out.println("Salário anual de " + func1.getPrimeiroNome() + ": R$ " + func1.getSalarioAnual());
        System.out.println("Salário anual de " + func2.getPrimeiroNome() + ": R$ " + func2.getSalarioAnual());

        func1.setSalarioMensal(func1.getSalarioMensal() * 1.10);
        func2.setSalarioMensal(func2.getSalarioMensal() * 1.10);

        System.out.println("\nApós aumento de 10%:");
        System.out.println("Salário anual de " + func1.getPrimeiroNome() + ": R$ " + func1.getSalarioAnual());
        System.out.println("Salário anual de " + func2.getPrimeiroNome() + ": R$ " + func2.getSalarioAnual());
    }
}
