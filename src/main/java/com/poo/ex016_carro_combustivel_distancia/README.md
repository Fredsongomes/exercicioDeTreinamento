# Estado Interno e Regras de Negócio: Carro, Combustível e Distância

> **Módulo:** Programação Orientada a Objetos · **Exercício 16** · Pasta `ex016_carro_combustivel_distancia`

## O que é o exercício

Exercício de simulação do consumo de combustível de um carro.

## O que ele faz

Permite abastecer o carro (tanque de 50 L) e movê-lo (15 km/L), controlando o combustível restante e a distância total percorrida.

## Conteúdos utilizados

- Classe e objeto
- Constantes de classe `private static final`
- Atributos `private`
- Construtor sem parâmetros
- Métodos que alteram o estado (`abastecer`, `mover`)
- Operadores compostos (`+=`, `-=`)
- Estruturas condicionais
- Getters

## Como funciona

1. `abastecer()` soma litros ao tanque e descarta o que passar da capacidade.
2. `mover()` calcula os litros necessários. Se houver combustível, percorre toda a distância. Se não houver, percorre apenas o possível e zera o tanque.
3. `CarroTeste` cria dois carros com abastecimentos e distâncias diferentes e exibe o resultado.

## Principais conceitos praticados

- Simulação de comportamento com regras
- Objetos independentes com estados distintos
- Uso de constantes para parâmetros do modelo

## Arquivos

| Arquivo | Descrição |
|---|---|
| `Carro.java` | Classe modelo. |
| `CarroTeste.java` | Classe de teste com o método `main`. |
