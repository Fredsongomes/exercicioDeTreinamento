package com.poo.ex011_ingresso_heranca;

public class IngressoTeste {
    public static void main(String[] args) {
        Ingresso ingressoComum = new Ingresso(80.0);
        IngressoVip ingressoVip = new IngressoVip(80.0, 120.0);

        ingressoComum.imprimirValor();
        ingressoVip.imprimirValor();

        double diferenca = ingressoVip.getValorTotal() - ingressoComum.getValor();
        System.out.println("Diferença de preço entre VIP e comum: R$ " + diferenca);
    }
}
