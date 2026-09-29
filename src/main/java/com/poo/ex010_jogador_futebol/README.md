# Classes, Encapsulamento e switch com String: Jogador de Futebol

> **Módulo:** Programação Orientada a Objetos · **Exercício 10** · Pasta `ex010_jogador_futebol`

## O que é o exercício

Exercício de modelagem de um jogador com cálculos baseados em seus dados.

## O que ele faz

Cria jogadores, calcula a idade e o tempo que falta para a aposentadoria conforme a posição e exibe todos os dados.

## Conteúdos utilizados

- Classe e objeto
- Atributos `private`
- Construtor com parâmetros
- Getters e setters
- API de datas: `LocalDate` e `Period`
- Estrutura `switch` com `String`
- Método `toLowerCase()`
- Método `Math.max()`
- Chamada de métodos dentro de outros métodos

## Como funciona

1. `calcularIdade()` calcula a idade a partir da data de nascimento.
2. `tempoParaAposentar()` define a idade de aposentadoria pela posição (Defesa 40, Meio-campo 38, Atacante 35) e retorna o tempo restante, nunca negativo. Para posição desconhecida, retorna -1.
3. `imprimirDados()` exibe os dados e os cálculos.
4. `JogadorTeste` cria dois jogadores e exibe seus dados.

## Principais conceitos praticados

- Métodos que usam o estado do objeto para calcular informações
- `switch` com texto

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Jogador.java` | Classe modelo. |
| `JogadorTeste.java` | Classe de teste com o método `main`. |
