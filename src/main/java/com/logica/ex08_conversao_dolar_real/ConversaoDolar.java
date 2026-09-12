package com.logica.ex08_conversao_dolar_real;

import java.util.Scanner;

public class ConversaoDolar {

    static void main(String[] args) {

        double  valorDolar;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um valor em US$: ");
        valorDolar = leitura.nextDouble();

        double conversaoMoeda = valorDolar * 5.12;

        System.out.println(valorDolar +" US$" +" Em reais é : "+ conversaoMoeda + "$");
    }
}
