# Herança e Sobrescrita de Métodos: Ingresso Comum e VIP

> **Módulo:** Programação Orientada a Objetos · **Exercício 11** · Pasta `ex011_ingresso_heranca`

## O que é o exercício

Primeiro exercício de herança.

## O que ele faz

Modela um ingresso comum e um ingresso VIP, que herda do comum e soma um valor adicional. Exibe os valores e a diferença entre eles.

## Conteúdos utilizados

- Herança com `extends`
- Modificador de acesso `protected`
- Chamada ao construtor da superclasse com `super(...)`
- Sobrescrita de método com `@Override`
- Atributos `private`
- Getters

## Como funciona

1. `Ingresso` possui o atributo `valor` (`protected`) e o método `imprimirValor()`.
2. `IngressoVip` estende `Ingresso`, adiciona `valorAdicional` e sobrescreve `imprimirValor()`.
3. `getValorTotal()` soma o valor base ao adicional.
4. `IngressoTeste` cria os dois ingressos, exibe os valores e calcula a diferença.

## Principais conceitos praticados

- Reaproveitamento de código por herança
- Especialização de comportamento com sobrescrita
- Acesso da subclasse a atributos `protected`

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Ingresso.java` | Superclasse. |
| `IngressoVip.java` | Subclasse. |
| `IngressoTeste.java` | Classe de teste com o método `main`. |
