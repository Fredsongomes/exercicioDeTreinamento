package com.poo.ex06_invoice_getters_setters;

public class Invoice {
    private int numeroItem;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Invoice(int numeroItem, String descricao, int quantidade, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
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

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = (precoUnitario > 0) ? precoUnitario : 0.0;
    }

    public double getInvoiceAmount() {
        return quantidade * precoUnitario;
    }
}
