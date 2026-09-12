package com.poo.ex014_fatura__getters_setters;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoItem;

    public Fatura(String numero, String descricao, int quantidade, double precoItem) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPrecoItem(precoItem);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = (quantidade > 0) ? quantidade : 0;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = (precoItem > 0) ? precoItem : 0;
    }

    public double getTotalFatura() {
        return quantidade * precoItem;
    }
}
