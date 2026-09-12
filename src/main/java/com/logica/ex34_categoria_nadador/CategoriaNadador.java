package com.logica.ex34_categoria_nadador;

import java.util.Scanner;

public class CategoriaNadador {
    static void main(String[] args) {
        int idade;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = leitura.nextInt();

        if ((idade >= 5) && (idade <= 7)) {
            System.out.println("Infantil A!");
        }
        else if ((idade >= 8) && (idade <= 10)) {
            System.out.println("Infantil B!");
        }
        else if ((idade >= 11) && (idade <= 13)) {
            System.out.println("Juvenil A!");
        }
        else if ((idade >= 14) && (idade <= 17)) {
            System.out.println("Juvenil B!");
        } else if ((idade >= 18) && (idade <= 25)) {
            System.out.println("Senior!");
        } else {
            System.out.println("Idade fora da faixa etária! ");
        }
    }
}
