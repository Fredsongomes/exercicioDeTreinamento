# Encapsulamento com Validação nos Setters: Fatura

> **Módulo:** Programação Orientada a Objetos · **Exercício 14** · Pasta `ex014_fatura__getters_setters`

## O que é o exercício

Exercício de encapsulamento que representa uma fatura de item.

## O que ele faz

Registra número, descrição, quantidade e preço de um item e calcula o total da fatura. Quantidade ou preço não positivos são ajustados para 0.

## Conteúdos utilizados

- Classe e objeto
- Atributos `private`
- Construtor que chama setters
- Getters e setters
- Operador ternário (`? :`)
- Método de cálculo (`getTotalFatura`)

## Como funciona

1. O construtor delega a validação a `setQuantidade()` e `setPrecoItem()`.
2. Os setters substituem valores não positivos por 0.
3. `getTotalFatura()` retorna quantidade × preço.
4. `FaturaTeste` cria uma fatura válida e outra com valores negativos e exibe as duas.

## Principais conceitos praticados

- Validação centralizada nos setters
- Consistência do objeto desde a criação

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Fatura.java` | Classe modelo. |
| `FaturaTeste.java` | Classe de teste com o método `main`. |
