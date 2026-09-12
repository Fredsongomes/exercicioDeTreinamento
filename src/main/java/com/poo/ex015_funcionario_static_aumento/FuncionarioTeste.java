package com.poo.ex015_funcionario_static_aumento;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Carla", "Mendes", 3200.0);
        Funcionario func2 = new Funcionario("Diego", "Ramos", 5100.0);

        System.out.println("Salário de " + func1.getNome() + ": R$ " + func1.getSalarioMensal());
        System.out.println("Salário de " + func2.getNome() + ": R$ " + func2.getSalarioMensal());

        func1.setSalarioMensal(func1.getSalarioMensal() * 1.10);
        func2.setSalarioMensal(func2.getSalarioMensal() * 1.10);

        System.out.println("\nApós aumento de 10%:");
        System.out.println("Salário anual de " + func1.getNome() + ": R$ " + func1.getSalarioAnual());
        System.out.println("Salário anual de " + func2.getNome() + ": R$ " + func2.getSalarioAnual());

        System.out.println("\nTotal de funcionários criados até agora: " + Funcionario.getTotalFuncionarios());
    }
}
