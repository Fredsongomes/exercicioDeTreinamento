# Interfaces e Encapsulamento: Controle Remoto

> **Módulo:** Programação Orientada a Objetos · **Exercício 18** · Pasta `ex018_controle_remoto_encapsulamento`

## O que é o exercício

Exercício que define um contrato com interface e o implementa em uma classe encapsulada.

## O que ele faz

Simula um controle remoto que liga e desliga, ajusta o volume, ativa o mudo, dá play e pause e exibe um menu com o estado atual.

## Conteúdos utilizados

- Interface (`interface`) com métodos abstratos
- Implementação de interface com `implements`
- Sobrescrita de métodos com `@Override`
- Getters e setters `private`
- Construtor que define o estado inicial
- Estruturas condicionais com `&&` e `!`
- Laço `for` com incremento de 10 (barra de volume)
- Comentário de linha

## Como funciona

1. `Controlador` define os métodos que todo controle deve ter.
2. `ControleRemoto` implementa todos esses métodos.
3. Os getters e setters são `private`: o estado só muda pelos métodos públicos da interface.
4. Volume, mudo, play e pause só funcionam com o controle ligado.
5. `abrirMenu()` exibe o estado e desenha uma barra de volume com `|`.
6. `ControleRemotoTeste` liga o controle, aumenta o volume, dá play e abre e fecha o menu.

## Principais conceitos praticados

- Programação orientada a contratos (interfaces)
- Encapsulamento rigoroso com acessores privados
- Controle de estado com regras

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Controlador.java` | Interface. |
| `ControleRemoto.java` | Classe que implementa a interface. |
| `ControleRemotoTeste.java` | Classe de teste com o método `main`. |
