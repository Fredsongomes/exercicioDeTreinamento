# Constantes de Classe e Métodos de Cálculo: Média Ponderada do Aluno

> **Módulo:** Programação Orientada a Objetos · **Exercício 05** · Pasta `ex05_aluno_calculo_media`

## O que é o exercício

Exercício que aplica regras de avaliação em uma classe.

## O que ele faz

Calcula a média ponderada de um aluno (duas provas com peso 2,5 e um trabalho com peso 2,0), define a situação e informa a nota necessária no exame final.

## Conteúdos utilizados

- Classe e objeto
- Constantes de classe `private static final`
- Atributos `private`
- Construtor com parâmetros
- Getters
- Métodos com retorno (`double` e `String`)
- Variáveis `boolean`
- Operador lógico `||`
- Método auxiliar `private static` na classe de teste
- Saída formatada com `printf` (`%.2f`, `%n`)

## Como funciona

1. `media()` calcula a média ponderada usando as constantes de peso.
2. `situacao()` retorna "Aprovado direto" (≥ 7), "Reprovado (sem direito a exame final)" (< 3) ou "Precisa fazer o exame final".
3. `notaNecessariaNoExameFinal()` retorna `(2 × 5) − média` quando o aluno vai para o exame, e 0 nos outros casos.
4. A classe de teste cria três alunos, um para cada situação, e exibe os resultados com o método `imprimirResultado`.

## Principais conceitos praticados

- Eliminação de "números mágicos" com constantes nomeadas
- Reutilização de métodos (`media()` usado por outros métodos)
- Variáveis booleanas descritivas

## Arquivos

| Arquivo | Descrição |
|---|---|
| `AlunoCalculaMedia.java` | Classe modelo. |
| `AlunoCalculaMediaTeste.java` | Classe de teste com o método `main`. |
