package com.poo.ex012_agenda_array_objetos;

public class Agenda {
    private static final int CAPACIDADE = 10;

    private String[] nomes;
    private int[] idades;
    private float[] alturas;
    private int totalCadastrados;

    public Agenda() {
        nomes = new String[CAPACIDADE];
        idades = new int[CAPACIDADE];
        alturas = new float[CAPACIDADE];
        totalCadastrados = 0;
    }

    public void armazenarPessoa(String nome, int idade, float altura) {
        if (totalCadastrados >= CAPACIDADE) {
            System.out.println("Agenda cheia. Não é possível armazenar mais pessoas.");
            return;
        }

        nomes[totalCadastrados] = nome;
        idades[totalCadastrados] = idade;
        alturas[totalCadastrados] = altura;
        totalCadastrados++;
    }

    public void removerPessoa(String nome) {
        int posicao = buscarPessoa(nome);

        if (posicao == -1) {
            System.out.println("Pessoa não encontrada na agenda.");
            return;
        }

        for (int i = posicao; i < totalCadastrados - 1; i++) {
            nomes[i] = nomes[i + 1];
            idades[i] = idades[i + 1];
            alturas[i] = alturas[i + 1];
        }

        nomes[totalCadastrados - 1] = null;
        idades[totalCadastrados - 1] = 0;
        alturas[totalCadastrados - 1] = 0;
        totalCadastrados--;
    }

    public int buscarPessoa(String nome) {
        for (int i = 0; i < totalCadastrados; i++) {
            if (nomes[i].equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void imprimirAgenda() {
        for (int i = 0; i < totalCadastrados; i++) {
            imprimirPessoa(i);
        }
    }

    public void imprimirPessoa(int index) {
        if (index < 0 || index >= totalCadastrados) {
            System.out.println("Posição inválida.");
            return;
        }

        System.out.println("Nome: " + nomes[index] + " | Idade: " + idades[index] + " | Altura: " + alturas[index] + "m");
    }
}
