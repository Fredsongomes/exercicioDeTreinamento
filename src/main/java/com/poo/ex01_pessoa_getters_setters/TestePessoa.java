package com.poo.ex01_pessoa_getters_setters;

import java.time.LocalDate;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Fredson", LocalDate.of(2006, 6, 14), 1.74);
        pessoa1.imprimirDados();

        System.out.println();

        pessoa1.setNome("Fredson");
        pessoa1.setAltura(1.70);

        System.out.println("Após alteração dos dados:");
        pessoa1.imprimirDados();
    }
}
