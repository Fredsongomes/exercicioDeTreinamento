# Coleções (ArrayList) e Relacionamento entre Classes: Agenda de Compromissos

> **Módulo:** Programação Orientada a Objetos · **Exercício 17** · Pasta `ex017_agenda_compromissos`

## O que é o exercício

Exercício que troca arrays de tamanho fixo por uma coleção dinâmica de objetos.

## O que ele faz

Gerencia compromissos (tipo, data, participante e telefone), permitindo agendar, alterar, remover e listar todos, por data ou por participante.

## Conteúdos utilizados

- Interface `List` e classe `ArrayList`
- Generics (`List<Compromisso>`)
- Operador diamante (`<>`)
- Métodos de lista: `add`, `remove`, `indexOf` e `set`
- Laço `for-each`
- Classe que contém uma lista de objetos de outra classe
- Sobrescrita de `toString()` com `@Override`
- Getters e setters
- Comparação de `String` com `equals()` e `equalsIgnoreCase()`

## Como funciona

1. `Compromisso` representa um compromisso e define como ele é exibido em `toString()`.
2. `AgendaCompromisso` guarda os compromissos em um `ArrayList`.
3. `alterar()` localiza o compromisso antigo com `indexOf` e o substitui com `set`.
4. `exibirPorData()` e `exibirPorParticipante()` filtram a lista com `for-each`.
5. `AgendaTeste` agenda, filtra, altera e remove compromissos, exibindo cada etapa.

## Principais conceitos praticados

- Coleções dinâmicas
- Filtragem de objetos em lista
- Relacionamento entre classes

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Compromisso.java` | Classe modelo do compromisso. |
| `AgendaCompromisso.java` | Classe que gerencia a lista de compromissos. |
| `AgendaTeste.java` | Classe de teste com o método `main`. |
