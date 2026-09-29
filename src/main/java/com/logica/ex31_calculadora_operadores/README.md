# Estrutura de Seleção (switch) com char: Calculadora de Operadores

> **Módulo:** Lógica de Programação · **Exercício 31** · Pasta `ex31_calculadora_operadores`

## O que é o exercício

Exercício de calculadora que escolhe a operação pelo símbolo digitado.

## O que ele faz

Lê dois números e um operador (`+`, `-`, `*`, `/`) e exibe o resultado. Impede a divisão por zero e trata operadores inválidos.

## Conteúdos utilizados

- Entrada de dados com `Scanner`
- Tipo `char` e método `charAt(0)`
- Estrutura de seleção `switch` com `char`
- Estrutura condicional `if/else` dentro de um `case`
- Operadores aritméticos
- Limpeza do buffer do `Scanner`

## Como funciona

1. Lê A e B.
2. Lê o operador e pega o primeiro caractere com `charAt(0)`.
3. O `switch` executa a operação correspondente.
4. Na divisão, verifica se B é zero antes de calcular.
5. O `default` exibe "Operador não definido."

## Principais conceitos praticados

- `switch` com caracteres
- Validação de entrada (divisão por zero)
- Combinação de `switch` com `if`

## Arquivos

| Arquivo | Descrição |
|---|---|
| `CalculadoraOperadores.java` | Programa principal. |
