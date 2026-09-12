package com.logica.ex11_preco_venda_produto;

import java.util.Scanner;

public class PrecoVendaProduto {
    static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double custoProduto;
        double percentualAcrescimo;
        double precoVenda;

        System.out.println("Digite o custo do produto: ");
        custoProduto = leitura.nextDouble();

        System.out.println("Digite o percentual de acréscimo: ");
        percentualAcrescimo = leitura.nextDouble();

        precoVenda = custoProduto + (custoProduto * percentualAcrescimo / 100);

        System.out.println("O preço de venda do produto é: " + precoVenda);
    }
}
