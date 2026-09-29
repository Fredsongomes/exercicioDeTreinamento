# Encapsulamento e Métodos de Cálculo: Salário Anual do Funcionário

> **Módulo:** Programação Orientada a Objetos · **Exercício 07** · Pasta `ex07_funcionario_salario_anual`

## O que é o exercício

Exercício de encapsulamento aplicado a um funcionário.

## O que ele faz

Cria funcionários, exibe o salário anual, aplica um aumento de 10% e exibe o novo salário anual.

## Conteúdos utilizados

- Classe e objeto
- Atributos `private`
- Construtor que chama setter
- Getters e setters
- Operador ternário para validação
- Método de cálculo (`getSalarioAnual`)

## Como funciona

1. `setSalarioMensal()` ajusta valores não positivos para 0.
2. `getSalarioAnual()` retorna o salário mensal × 12.
3. `FuncionarioTeste` cria dois funcionários, exibe os salários anuais, aplica 10% de aumento com o setter e exibe novamente.

## Principais conceitos praticados

- Alteração de estado por meio de setters
- Múltiplos objetos da mesma classe

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Funcionario.java` | Classe modelo. |
| `FuncionarioTeste.java` | Classe de teste com o método `main`. |
