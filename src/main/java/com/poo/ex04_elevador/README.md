# Controle de Estado e Regras de Negócio: Elevador

> **Módulo:** Programação Orientada a Objetos · **Exercício 04** · Pasta `ex04_elevador`

## O que é o exercício

Exercício de simulação do comportamento de um elevador.

## O que ele faz

Controla a entrada e saída de pessoas e a subida e descida de andares, respeitando a capacidade e os limites do prédio.

## Conteúdos utilizados

- Classe e objeto
- Atributos `private`
- Método de inicialização (`inicializa`)
- Métodos sem retorno (`void`)
- Getters
- Estruturas condicionais
- Operadores de incremento e decremento (`++` e `--`)

## Como funciona

1. `inicializa()` define a capacidade e o total de andares e começa no térreo, vazio.
2. `entra()` e `sai()` respeitam a capacidade máxima e o elevador vazio.
3. `sobe()` e `desce()` respeitam o último andar e o térreo.
4. `ElevadorTeste` executa uma sequência de ações e exibe o estado.

## Principais conceitos praticados

- Garantia de estados válidos do objeto
- Métodos que representam comportamentos

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Elevador.java` | Classe modelo. |
| `ElevadorTeste.java` | Classe de teste com o método `main`. |
