# Classes, Objetos e Encapsulamento: Pessoa

> **Módulo:** Programação Orientada a Objetos · **Exercício 01** · Pasta `ex01_pessoa_getters_setters`

## O que é o exercício

Primeiro exercício de Orientação a Objetos. Modela uma pessoa como classe.

## O que ele faz

Cria uma pessoa com nome, data de nascimento e altura, calcula sua idade e exibe os dados antes e depois de alterá-los.

## Conteúdos utilizados

- Classe e objeto
- Atributos `private`
- Construtor com parâmetros
- Palavra-chave `this`
- Métodos getters e setters
- API de datas: `LocalDate` e `Period`
- Métodos de instância

## Como funciona

1. A classe `Pessoa` guarda nome, data de nascimento e altura.
2. `calcularIdade()` usa `Period.between` entre a data de nascimento e `LocalDate.now()`.
3. `imprimirDados()` exibe todas as informações.
4. `TestePessoa` cria o objeto, exibe os dados, altera nome e altura com setters e exibe novamente.

## Principais conceitos praticados

- Encapsulamento
- Instanciação de objetos com `new`
- Separação entre a classe modelo e a classe de teste

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Pessoa.java` | Classe modelo. |
| `TestePessoa.java` | Classe de teste com o método `main`. |
