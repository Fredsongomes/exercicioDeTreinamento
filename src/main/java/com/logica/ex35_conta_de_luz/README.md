# Estrutura Condicional Encadeada e Constantes: Conta de Luz

> **Módulo:** Lógica de Programação · **Exercício 35** · Pasta `ex35_conta_de_luz`

## O que é o exercício

Exercício de cálculo de tarifa conforme o tipo de cliente.

## O que ele faz

Lê o tipo de cliente (Residência, Comércio ou Indústria) e o consumo em kW/h e exibe o valor da conta de luz.

## Conteúdos utilizados

- Entrada de dados com `Scanner`
- Constantes `final`
- Estrutura condicional encadeada
- Encerramento antecipado do `main` com `return`
- Fechamento do `Scanner` com `close()`
- Saída com `System.out.printf`

## Como funciona

1. Define as tarifas por kW/h de cada tipo de cliente.
2. Lê o tipo de cliente e o consumo.
3. Multiplica o consumo pela tarifa correspondente.
4. Se o tipo for inválido, exibe uma mensagem, fecha o `Scanner` e encerra com `return`.
5. Exibe o valor da conta.

## Principais conceitos praticados

- Regras de negócio com constantes
- Saída antecipada de método em caso de erro

## Arquivos

| Arquivo | Descrição |
|---|---|
| `ContaDeLuz.java` | Programa principal. |
