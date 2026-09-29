# Métodos Privados, Validação e Comparação de Objetos: Data

> **Módulo:** Programação Orientada a Objetos · **Exercício 08** · Pasta `ex08_data_comparacao`

## O que é o exercício

Exercício de criação de uma classe de data própria, com validação e comparação.

## O que ele faz

Representa uma data, valida dia, mês e ano (incluindo anos bissextos), compara datas, retorna o mês por extenso e gera uma cópia da data.

## Conteúdos utilizados

- Classe e objeto
- Atributos `private`
- Construtor com validação
- Métodos auxiliares `private`
- Arrays (`int[]` e `String[]`)
- Operador de módulo (`%`) e operadores lógicos
- Operador ternário
- Método que recebe outro objeto como parâmetro (`compara`)
- Método que retorna uma nova instância (`clone`)
- Sobrescrita de `toString()` com `@Override`
- `String.format` para formatação

## Como funciona

1. O construtor valida a data com `isDataValida()`. Se for inválida, usa `01/01/0001`.
2. `diasNoMes()` consulta um array de dias por mês e trata fevereiro em ano bissexto.
3. `compara()` retorna `1`, `-1` ou `0` comparando ano, mês e dia.
4. `getMesExtenso()` usa um array de nomes de meses.
5. `toString()` formata a data como `dd/mm/aaaa`.
6. `DataTeste` testa datas válidas e inválidas, comparações e a cópia.

## Principais conceitos praticados

- Métodos privados para organizar a lógica interna
- Comparação entre objetos da mesma classe
- Representação textual do objeto

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Data.java` | Classe modelo. |
| `DataTeste.java` | Classe de teste com o método `main`. |
