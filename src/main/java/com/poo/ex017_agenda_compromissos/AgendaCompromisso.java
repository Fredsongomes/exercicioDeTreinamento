package com.poo.ex017_agenda_compromissos;

import java.util.ArrayList;
import java.util.List;

public class AgendaCompromisso {
    private List<Compromisso> compromissos;

    public AgendaCompromisso() {
        compromissos = new ArrayList<>();
    }

    public void agendar(Compromisso compromisso) {
        compromissos.add(compromisso);
    }

    public boolean remover(Compromisso compromisso) {
        return compromissos.remove(compromisso);
    }

    public boolean alterar(Compromisso antigo, Compromisso novo) {
        int indice = compromissos.indexOf(antigo);

        if (indice == -1) {
            return false;
        }

        compromissos.set(indice, novo);
        return true;
    }

    public void exibirPorParticipante(String participante) {
        System.out.println("Compromissos de " + participante + ":");
        for (Compromisso c : compromissos) {
            if (c.getParticipante().equalsIgnoreCase(participante)) {
                System.out.println(c);
            }
        }
    }

    public void exibirPorData(String data) {
        System.out.println("Compromissos na data " + data + ":");
        for (Compromisso c : compromissos) {
            if (c.getData().equals(data)) {
                System.out.println(c);
            }
        }
    }

    public void exibirTodos() {
        for (Compromisso c : compromissos) {
            System.out.println(c);
        }
    }
}
