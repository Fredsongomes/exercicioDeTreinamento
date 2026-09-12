package com.poo.ex012_agenda_array_objetos;

public class Agenda {
    private static final int CAPACIDADE = 10;

    private Pessoa[] pessoas;
    private int totalCadastrados;

    public Agenda() {
        pessoas = new Pessoa[CAPACIDADE];
        totalCadastrados = 0;
    }

    public void armazenarPessoa(String nome, int idade, float altura) {
        if (totalCadastrados >= CAPACIDADE) {
            System.out.println("Agenda cheia. Não é possível armazenar mais pessoas.");
            return;
        }

        pessoas[totalCadastrados] = new Pessoa(nome, idade, altura);
        totalCadastrados++;
    }

    public void removerPessoa(String nome) {
        int posicao = buscarPessoa(nome);

        if (posicao == -1) {
            System.out.println("Pessoa não encontrada na agenda.");
            return;
        }

        for (int i = posicao; i < totalCadastrados - 1; i++) {
            pessoas[i] = pessoas[i + 1];
        }

        pessoas[totalCadastrados - 1] = null;
        totalCadastrados--;
    }

    public int buscarPessoa(String nome) {
        for (int i = 0; i < totalCadastrados; i++) {
            if (pessoas[i].getNome().equalsIgnoreCase(nome)) {
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

        Pessoa pessoa = pessoas[index];
        System.out.println("Nome: " + pessoa.getNome() + " | Idade: " + pessoa.getIdade() + " | Altura: " + pessoa.getAltura() + "m");
    }
}
