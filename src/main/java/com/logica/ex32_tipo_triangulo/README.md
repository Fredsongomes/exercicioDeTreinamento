# Condicionais Aninhadas e Operadores Lógicos: Classificação de Triângulos

> **Módulo:** Lógica de Programação · **Exercício 32** · Pasta `ex32_tipo_triangulo`

## O que é o exercício

Exercício de validação e classificação usando várias condições.

## O que ele faz

Lê três lados, verifica se formam um triângulo e o classifica como equilátero, isósceles ou escaleno.

## Conteúdos utilizados

- Entrada de dados com `Scanner`
- Estruturas condicionais aninhadas
- Operadores lógicos `&&` e `||`
- Operadores relacionais e aritméticos

## Como funciona

1. Lê os três lados.
2. Verifica a condição de existência: cada lado deve ser menor que a soma dos outros dois.
3. Se for válido: três lados iguais formam um **equilátero**, dois iguais um **isósceles** e todos diferentes um **escaleno**.
4. Se não for válido, informa que não forma um triângulo.

## Principais conceitos praticados

- Validação antes do processamento
- Uso combinado de `&&` e `||`
- Aninhamento de decisões

## Arquivos

| Arquivo | Descrição |
|---|---|
| `TipoTriangulo.java` | Programa principal. |
