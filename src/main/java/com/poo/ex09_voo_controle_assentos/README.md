# Composição de Objetos e Arrays: Controle de Assentos de Voo

> **Módulo:** Programação Orientada a Objetos · **Exercício 09** · Pasta `ex09_voo_controle_assentos`

## O que é o exercício

Exercício em que uma classe usa outra como atributo.

## O que ele faz

Representa um voo com número e data, controla a ocupação de 100 cadeiras e informa a próxima cadeira livre e o total de vagas.

## Conteúdos utilizados

- Composição: a classe `Voo` possui um atributo do tipo `Data`
- Constante de classe `private static final`
- Array de `boolean`
- Laço `for` tradicional e `for-each`
- Métodos com retorno `boolean` e `int`
- Reutilização da classe `Data` do exercício anterior

## Como funciona

1. O construtor cria o array de 100 cadeiras. `false` significa livre.
2. `proximoLivre()` percorre o array e retorna o número da primeira cadeira livre, ou -1.
3. `verifica()` informa se uma cadeira está ocupada.
4. `ocupa()` marca a cadeira como ocupada e retorna `false` se ela já estiver ocupada.
5. `vagas()` conta as cadeiras livres com `for-each`.
6. `TesteVoo` simula ocupações e consultas.

## Principais conceitos praticados

- Composição entre classes (relação "tem um")
- Arrays como estrutura interna de um objeto
- Conversão entre número da cadeira e índice do array

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Voo.java` | Classe modelo do voo. |
| `Data.java` | Classe de data usada pelo voo. |
| `TesteVoo.java` | Classe de teste com o método `main`. |
