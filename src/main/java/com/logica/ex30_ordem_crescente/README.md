# Métodos da Classe Math: Ordenação de Três Valores

> **Módulo:** Lógica de Programação · **Exercício 30** · Pasta `ex30_ordem_crescente`

## O que é o exercício

Exercício de ordenação de três números usando métodos prontos do Java.

## O que ele faz

Lê três números inteiros e os exibe em ordem crescente.

## Conteúdos utilizados

- Entrada de dados com `Scanner`
- Métodos `Math.min()` e `Math.max()`
- Chamadas de método aninhadas
- Operadores aritméticos

## Como funciona

1. Lê três valores.
2. Encontra o menor com `Math.min(a, Math.min(b, c))`.
3. Encontra o maior com `Math.max(a, Math.max(b, c))`.
4. Obtém o valor do meio subtraindo o menor e o maior da soma dos três.
5. Exibe os valores em ordem crescente.

## Principais conceitos praticados

- Uso da biblioteca padrão (`Math`)
- Raciocínio matemático para evitar várias comparações

## Arquivos

| Arquivo | Descrição |
|---|---|
| `OrdemCrescente.java` | Programa principal. |
