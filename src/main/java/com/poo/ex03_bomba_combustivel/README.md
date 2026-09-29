# Métodos com Retorno e Estado do Objeto: Bomba de Combustível

> **Módulo:** Programação Orientada a Objetos · **Exercício 03** · Pasta `ex03_bomba_combustivel`

## O que é o exercício

Exercício de modelagem de um objeto do mundo real com estoque e operações.

## O que ele faz

Simula uma bomba de combustível que abastece por valor ou por litro, controla o estoque e permite alterar o tipo de combustível, o preço e a quantidade disponível.

## Conteúdos utilizados

- Classe e objeto
- Atributos `private`
- Construtor com parâmetros
- Métodos com retorno (`double`)
- Métodos modificadores
- Getters
- Estruturas condicionais
- Comentário de linha

## Como funciona

1. `abastecerPorValor()` calcula os litros correspondentes ao valor e desconta do estoque.
2. `abastecerPorLitro()` calcula o valor a pagar e desconta do estoque.
3. Os dois métodos verificam se há combustível suficiente e retornam 0 se não houver.
4. Os métodos `alterar...()` modificam os atributos.
5. `TesteBombaCombustivel` executa as operações e exibe o estado da bomba.

## Principais conceitos praticados

- Estado interno alterado por métodos
- Validação antes de modificar o estado
- Métodos que retornam valores

## Arquivos

| Arquivo | Descrição |
|---|---|
| `BombaCombustivel.java` | Classe modelo. |
| `TesteBombaCombustivel.java` | Classe de teste com o método `main`. |
