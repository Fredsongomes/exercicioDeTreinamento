package com.poo.ex010_jogador_futebol;

import java.time.LocalDate;
import java.time.Period;

public class Jogador {
    private String nome;
    private String posicao;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public Jogador(String nome, String posicao, LocalDate dataNascimento,
                   String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcularIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public int tempoParaAposentar() {
        int idadeAposentadoria;

        switch (posicao.toLowerCase()) {
            case "defesa":
                idadeAposentadoria = 40;
                break;
            case "meio-campo":
                idadeAposentadoria = 38;
                break;
            case "atacante":
                idadeAposentadoria = 35;
                break;
            default:
                System.out.println("Posição desconhecida, não é possível calcular.");
                return -1;
        }

        int tempoRestante = idadeAposentadoria - calcularIdade();
        return Math.max(tempoRestante, 0);
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Posição: " + posicao);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Altura: " + altura + "m");
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Idade: " + calcularIdade() + " anos");
        System.out.println("Tempo para aposentar: " + tempoParaAposentar() + " anos");
    }
}
