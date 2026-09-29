# Estrutura de Repetição (do-while) e Acumuladores: Desconto por Ano do Carro

> **Módulo:** Lógica de Programação · **Exercício 20** · Pasta `ex20_desconto_carros_por_ano`

## O que é o exercício

Exercício de repetição controlada pelo usuário.

## O que ele faz

Calcula o desconto de cada veículo conforme o ano (12% até 2000 e 7% nos demais) enquanto o usuário quiser continuar. Ao final, exibe o total de carros, quantos são até 2000 e o valor total pago.

## Conteúdos utilizados

- Estrutura de repetição `do-while`
- Estrutura condicional `if/else`
- Contadores e acumulador (`+=`)
- Comparação de `String` com `equalsIgnoreCase()`
- Operador de negação (`!`)
- Limpeza do buffer do `Scanner` com `nextLine()`

## Como funciona

1. Lê o ano e o valor do veículo.
2. Aplica 12% de desconto se o ano for `<= 2000`, ou 7% nos demais casos.
3. Atualiza contadores e o acumulador do valor pago.
4. Pergunta se deseja continuar e repete enquanto a resposta não for "N".
5. Exibe o resumo final.

## Principais conceitos praticados

- Laço que executa ao menos uma vez (`do-while`)
- Condição de parada definida pelo usuário
- Padrões contador e acumulador

## Arquivos

| Arquivo | Descrição |
|---|---|
| `DescontoCarrosPorAno.java` | Programa principal. |
