package com.logica.ex33_salario_professores;

import java.util.Scanner;

public class SalarioProfessores {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        final double HORA_AULA_NIVEL1 = 12 ;
        final double HORA_AULA_NIVEL2 = 17 ;
        final double HORA_AULA_NIVEL3 = 25 ;
        double salario = 0;
        double qtdHoraTrabalhada;
        int nivel;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = leitura.nextLine();

        System.out.println("Digite qual o seu nível: ");
        nivel = leitura.nextInt();

        System.out.println("Digite a quantidade de aulas dadas no mês: ");
        qtdHoraTrabalhada = leitura.nextDouble();

        if (nivel == 1 ) {
            salario = (qtdHoraTrabalhada * HORA_AULA_NIVEL1);
        } else if (nivel == 2) {
            salario = (qtdHoraTrabalhada * HORA_AULA_NIVEL2);
        } else if (nivel == 3) {
            salario = (qtdHoraTrabalhada * HORA_AULA_NIVEL3);
        } else {
            System.out.println("Valores Inválidos");
        }

        System.out.println("O salário do " + nome + ": "+ salario);
    }

}
