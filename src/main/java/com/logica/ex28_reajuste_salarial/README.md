# Repetição e Condicionais por Faixas: Reajuste Salarial

> **Módulo:** Lógica de Programação · **Exercício 28** · Pasta `ex28_reajuste_salarial`

## O que é o exercício

Exercício de aplicação de regras por faixa de valores dentro de um laço.

## O que ele faz

Para 584 funcionários, lê nome e salário e aplica um reajuste conforme a faixa em salários mínimos (R$ 1.621): 50%, 20%, 15% ou 10%. Exibe o valor do reajuste e o novo salário de cada um.

## Conteúdos utilizados

- Estrutura de repetição `for`
- Constantes `final`
- Estrutura condicional encadeada com faixas de valores
- Operadores lógicos `&&`
- Expressões aritméticas nas condições
- Acumulador (`+=`)

## Como funciona

1. Repete a leitura para cada funcionário.
2. Menos de 3 salários mínimos: reajuste de 50%.
3. Entre 3 e 10 salários mínimos: 20%.
4. Acima de 10 e até 20 salários mínimos: 15%.
5. Acima de 20 salários mínimos: 10%.
6. Exibe os dados do funcionário e acumula o reajuste em `totalAumentoFolha`.
7. Após o laço, exibe o total de aumento na folha de pagamento.

## Principais conceitos praticados

- Classificação por faixas de valores
- Uso de constantes para regras de negócio
- Padrão acumulador

## Arquivos

| Arquivo | Descrição |
|---|---|
| `ReajusteSalarial.java` | Programa principal. |
