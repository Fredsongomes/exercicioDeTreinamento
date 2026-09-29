# Array de Objetos: Agenda de Pessoas

> **Módulo:** Programação Orientada a Objetos · **Exercício 12** · Pasta `ex012_agenda_array_objetos`

## O que é o exercício

Exercício de manipulação de um array de objetos encapsulado dentro de uma classe.

## O que ele faz

Mantém uma agenda de até 10 pessoas (nome, idade e altura) e permite armazenar, buscar, remover e imprimir registros.

## Conteúdos utilizados

- Classes e objetos
- Array de objetos (`Pessoa[]`)
- Constante de classe `private static final`
- Atributos `private` e getters
- Construtores com e sem parâmetros
- Laço `for`
- Busca linear
- Remoção com deslocamento de elementos
- Retorno antecipado com `return`
- Comparação de `String` com `equalsIgnoreCase()`
- Tipo `float` (literal com `f`)

## Como funciona

1. A classe `Pessoa` agrupa nome, idade e altura em um único objeto.
2. `Agenda` guarda as pessoas em um array `Pessoa[]` com capacidade para 10.
3. `armazenarPessoa()` cria um objeto `Pessoa` e o insere na próxima posição livre, se houver espaço.
4. `buscarPessoa()` percorre o array comparando o nome e retorna a posição ou -1.
5. `removerPessoa()` desloca os objetos seguintes uma posição para trás e reduz o total.
6. `imprimirAgenda()` e `imprimirPessoa()` exibem os registros, validando a posição.
7. `AgendaTeste` executa as operações e exibe a agenda.

## Principais conceitos praticados

- Arrays que armazenam objetos
- Manipulação manual de arrays (inserção, busca e remoção)
- Controle de quantidade de elementos com contador
- Validação de índices

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Pessoa.java` | Classe modelo da pessoa. |
| `Agenda.java` | Classe que gerencia o array de pessoas. |
| `AgendaTeste.java` | Classe de teste com o método `main`. |
