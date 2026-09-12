package com.poo.ex017_agenda_compromissos;

public class Compromisso {
    private String tipo; // reunião, pagamento, entrega de projeto, etc.
    private String data;
    private String participante;
    private String telefone;

    public Compromisso(String tipo, String data, String participante, String telefone) {
        this.tipo = tipo;
        this.data = data;
        this.participante = participante;
        this.telefone = telefone;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getParticipante() {
        return participante;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + " | Data: " + data + " | Participante: " + participante + " | Telefone: " + telefone;
    }
}

