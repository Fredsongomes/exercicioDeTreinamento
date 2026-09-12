package com.poo.ex09_voo_controle_assentos;

public class TesteVoo {
    public static void main(String[] args) {
        Data data = new Data(20, 12, 2026);
        Voo voo = new Voo(1234, data);

        System.out.println("Vôo: " + voo.getVoo() + " - Data: " + voo.getData());
        System.out.println("Vagas disponíveis: " + voo.vagas());

        System.out.println("\nPróxima cadeira livre: " + voo.proximoLivre());

        boolean sucesso = voo.ocupa(1);
        System.out.println("Ocupou cadeira 1? " + sucesso);

        sucesso = voo.ocupa(1); // já ocupada
        System.out.println("Tentou ocupar cadeira 1 novamente? " + sucesso);

        voo.ocupa(2);
        voo.ocupa(3);

        System.out.println("\nCadeira 2 está ocupada? " + voo.verifica(2));
        System.out.println("Cadeira 5 está ocupada? " + voo.verifica(5));

        System.out.println("Próxima cadeira livre agora: " + voo.proximoLivre());
        System.out.println("Vagas disponíveis: " + voo.vagas());
    }

}
