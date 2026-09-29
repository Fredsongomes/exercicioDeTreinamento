# Repetição com Quantidade Variável e Condições Compostas: Aptidão ao Serviço Militar

> **Módulo:** Lógica de Programação · **Exercício 21** · Pasta `ex21_apitdao_servico_militar`

## O que é o exercício

Exercício que combina laço de tamanho variável com várias condições.

## O que ele faz

Lê a quantidade de pessoas e, para cada uma, os dados de nome, sexo, idade e saúde. Informa se a pessoa está apta ao serviço militar e, ao final, exibe o total de aptos e não aptos.

## Conteúdos utilizados

- Estrutura de repetição `for` com limite informado pelo usuário
- Leitura mista de números e texto (`nextInt()` e `nextLine()`)
- Limpeza do buffer do `Scanner`
- Operador lógico `&&` com três condições
- Comparação de `String` com `equalsIgnoreCase()`
- Contadores

## Como funciona

1. Lê o número N de pessoas.
2. Para cada pessoa, lê nome, sexo, idade e saúde.
3. É apta se for do sexo masculino **e** tiver 18 anos ou mais **e** saúde "Boa".
4. Exibe o resultado individual e, ao final, os totais.

## Principais conceitos praticados

- Laço com número de repetições definido em tempo de execução
- Condições compostas

## Arquivos

| Arquivo | Descrição |
|---|---|
| `AptidaoServicoMilitar.java` | Programa principal. |
