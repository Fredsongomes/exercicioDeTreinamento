# Estrutura de Repetição (while) com Valor Sentinela: Desconto por Combustível

> **Módulo:** Lógica de Programação · **Exercício 27** · Pasta `ex27_desconto_carros_combustivel`

## O que é o exercício

Exercício de repetição controlada por um valor de parada.

## O que ele faz

Enquanto o valor do carro informado for diferente de 0, lê o tipo de combustível, aplica o desconto correspondente (Álcool 25%, Gasolina 21%, Diesel 14%) e exibe o valor a pagar. Ao final, exibe o total de descontos e o total pago.

## Conteúdos utilizados

- Estrutura de repetição `while`
- Valor sentinela (0 para encerrar)
- Constantes `final`
- Estrutura condicional encadeada
- Comparação de `String` com `equals()`
- Acumuladores (`+=`)
- Limpeza do buffer do `Scanner`
- Caractere de escape `\n`

## Como funciona

1. Lê o primeiro valor do carro antes do laço.
2. Enquanto o valor for diferente de 0: lê o combustível, calcula o desconto e o valor a pagar, e acumula os totais.
3. Lê o próximo valor no fim de cada iteração.
4. Ao encerrar, exibe o resumo final.

## Principais conceitos praticados

- Laço com condição testada no início
- Padrão de leitura com sentinela
- Padrão acumulador

## Arquivos

| Arquivo | Descrição |
|---|---|
| `DescontoCarrosCombustivel.java` | Programa principal. |
