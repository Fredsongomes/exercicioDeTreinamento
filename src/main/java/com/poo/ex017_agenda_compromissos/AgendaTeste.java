package com.poo.ex017_agenda_compromissos;

public class AgendaTeste {
    public static void main(String[] args) {
        AgendaCompromisso agenda = new AgendaCompromisso();

        Compromisso c1 = new Compromisso("Reunião", "15/09/2026", "Empresa XPTO", "(11) 98888-1234");
        Compromisso c2 = new Compromisso("Pagamento", "20/09/2026", "Fornecedor ABC", "(11) 97777-5678");
        Compromisso c3 = new Compromisso("Entrega de projeto", "15/09/2026", "Cliente Vertex", "(11) 96666-4321");

        agenda.agendar(c1);
        agenda.agendar(c2);
        agenda.agendar(c3);

        System.out.println("--- Todos os compromissos ---");
        agenda.exibirTodos();

        System.out.println("\n--- Compromissos na data 15/09/2026 ---");
        agenda.exibirPorData("15/09/2026");

        System.out.println("\n--- Compromissos do participante 'Fornecedor ABC' ---");
        agenda.exibirPorParticipante("Fornecedor ABC");

        Compromisso c2Alterado = new Compromisso("Pagamento", "22/09/2026", "Fornecedor ABC", "(11) 97777-5678");
        agenda.alterar(c2, c2Alterado);

        System.out.println("\n--- Após alterar data do compromisso com Fornecedor ABC ---");
        agenda.exibirPorParticipante("Fornecedor ABC");

        agenda.remover(c3);

        System.out.println("\n--- Após remover compromisso c3 ---");
        agenda.exibirTodos();
    }
}

