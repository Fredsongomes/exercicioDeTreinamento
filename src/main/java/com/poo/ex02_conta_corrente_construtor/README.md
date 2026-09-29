# Construtores e Sobrecarga: Conta Corrente

> **Módulo:** Programação Orientada a Objetos · **Exercício 02** · Pasta `ex02_conta_corrente_construtor`

## O que é o exercício

Exercício de modelagem de uma conta bancária com mais de um construtor.

## O que ele faz

Cria contas correntes com ou sem saldo inicial e permite depositar, sacar e alterar o nome do correntista, validando as operações.

## Conteúdos utilizados

- Classe e objeto
- Atributos `private`
- Sobrecarga de construtores
- Encadeamento de construtores com `this(...)`
- Getters
- Métodos com regras de negócio
- Estruturas condicionais para validação

## Como funciona

1. Um construtor recebe número e correntista e chama o outro com saldo `0.0` usando `this(...)`.
2. `deposito()` aceita apenas valores positivos.
3. `saque()` rejeita valores inválidos ou maiores que o saldo.
4. `TesteContaCorrente` cria duas contas, realiza operações e exibe os resultados, incluindo uma tentativa de saque sem saldo.

## Principais conceitos praticados

- Sobrecarga de construtores
- Valor padrão definido via construtor
- Proteção do estado do objeto com validações

## Arquivos

| Arquivo | Descrição |
|---|---|
| `ContaCorrente.java` | Classe modelo. |
| `TesteContaCorrente.java` | Classe de teste com o método `main`. |
