package com.logica.ex35_conta_de_luz;

import java.util.Scanner;

public class ContaDeLuz {
    static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);


        final double VALOR_KW_RESIDENCIA = 0.60;
        final double VALOR_KW_COMERCIO = 0.48;
        final double VALOR_KW_INDUSTRIA = 1.29;

        int tipoCliente;
        double qtdKwConsumido;
        double valorConta = 0;

        System.out.println("Digite o tipo de cliente (1 - Residência, 2 - Comércio, 3 - Indústria): ");
        tipoCliente = leitura.nextInt();

        System.out.println("Digite a quantidade de KW/h consumidos: ");
        qtdKwConsumido = leitura.nextDouble();

        if (tipoCliente == 1) {
            valorConta = qtdKwConsumido * VALOR_KW_RESIDENCIA;
        } else if (tipoCliente == 2) {
            valorConta = qtdKwConsumido * VALOR_KW_COMERCIO;
        } else if (tipoCliente == 3) {
            valorConta = qtdKwConsumido * VALOR_KW_INDUSTRIA;
        } else {
            System.out.println("Tipo de cliente inválido!");
            leitura.close();
            return;
        }
        System.out.printf("O valor da conta de luz é: R$ "+ valorConta);
    }
}

