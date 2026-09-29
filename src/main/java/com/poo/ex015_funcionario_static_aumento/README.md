# Membros Estáticos (static): Contador de Funcionários

> **Módulo:** Programação Orientada a Objetos · **Exercício 15** · Pasta `ex015_funcionario_static_aumento`

## O que é o exercício

Exercício que diferencia atributos de instância e atributos de classe.

## O que ele faz

Cria funcionários, aplica aumento de 10% no salário, exibe o salário anual e mostra quantos funcionários já foram criados.

## Conteúdos utilizados

- Atributo estático (`private static int`)
- Método estático (`public static`)
- Chamada de método estático pelo nome da classe
- Atributos `private`
- Construtor que incrementa o contador
- Getters e setters com validação (operador ternário)
- Comentário de linha

## Como funciona

1. `totalFuncionarios` é compartilhado por todos os objetos da classe.
2. Cada chamada ao construtor incrementa esse contador.
3. `getTotalFuncionarios()` é acessado com `Funcionario.getTotalFuncionarios()`.
4. `FuncionarioTeste` cria dois funcionários, aplica o aumento e exibe salários e total.

## Principais conceitos praticados

- Diferença entre membros de instância e de classe
- Estado compartilhado entre objetos

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Funcionario.java` | Classe modelo. |
| `FuncionarioTeste.java` | Classe de teste com o método `main`. |
