# Encapsulamento com Validação nos Setters: Invoice

> **Módulo:** Programação Orientada a Objetos · **Exercício 06** · Pasta `ex06_invoice_getters_setters`

## O que é o exercício

Exercício de encapsulamento em que os setters protegem os dados.

## O que ele faz

Representa um item de fatura e calcula o valor total. Quantidade ou preço negativos são ajustados para 0.

## Conteúdos utilizados

- Classe e objeto
- Atributos `private`
- Construtor que chama setters
- Getters e setters
- Operador ternário (`? :`)
- Método de cálculo (`getInvoiceAmount`)

## Como funciona

1. O construtor usa `setQuantidade()` e `setPrecoUnitario()`, então a validação também vale na criação do objeto.
2. Os setters usam o operador ternário para trocar valores não positivos por 0.
3. `getInvoiceAmount()` retorna quantidade × preço.
4. `InvoceTest` cria uma fatura válida e outra com valores negativos e exibe as duas.

## Principais conceitos praticados

- Validação centralizada nos setters
- Proteção contra estados inválidos

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Invoice.java` | Classe modelo. |
| `InvoceTest.java` | Classe de teste com o método `main`. |
