package com.logica.ex01_soma_dois_numeros;

import java.util.Scanner;

public class SomaDoisNumeros {

        static void main(String[] args) {


            Scanner leitura = new Scanner(System.in);

            System.out.println("Digite um número: ");
            double numero1 = leitura.nextDouble();

            System.out.println("Digite outro número: ");
            double numero2 = leitura.nextDouble();

            double soma = numero1 + numero2;
            System.out.println("A soma dos números é: " + soma);

            leitura.close();
        }
    }
