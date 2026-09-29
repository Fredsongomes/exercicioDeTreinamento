# Herança e Extensão de Funcionalidades: Calculadora Científica

> **Módulo:** Programação Orientada a Objetos · **Exercício 13** · Pasta `ex013_calculadora_heranca`

## O que é o exercício

Exercício de herança para ampliar os recursos de uma classe.

## O que ele faz

Implementa uma calculadora básica com as quatro operações e uma calculadora científica que herda dela e adiciona raiz quadrada e potência.

## Conteúdos utilizados

- Herança com `extends`
- Métodos com parâmetros e retorno
- Métodos `Math.sqrt()` e `Math.pow()`
- Estrutura condicional para evitar divisão por zero

## Como funciona

1. `Calculadora` implementa soma, subtração, multiplicação e divisão. A divisão por zero exibe uma mensagem e retorna 0.
2. `CalculadoraCientifica` estende `Calculadora` e adiciona `raizQuadrada()` e `potencia()`.
3. `CalculadoraTeste` usa as duas classes e mostra que a científica também acessa os métodos herdados, como `soma()`.

## Principais conceitos praticados

- Herança para adicionar comportamento sem reescrever código
- Uso de métodos herdados pela subclasse

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Calculadora.java` | Superclasse. |
| `CalculadoraCientifica.java` | Subclasse. |
| `CalculadoraTeste.java` | Classe de teste com o método `main`. |
