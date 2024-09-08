# Descrição do Problema

Os resultados das partidas de um time de futebol ao longo de um campeonato são armazenados em dois vetores de mesmo tamanho. O primeiro vetor guarda o número de gols efetuados por esse time em cada partida. O segundo vetor guarda o número de gols efetuados pelo time adversário. Uma posição `i` de cada vetor indica a `i`-ésima partida realizada.

Escreva um programa (classe `TimeFutebol`) que leia esses dois vetores, na ordem em que foram explicados. Como saída, deve ser informado em uma única linha os seguintes dados, em ordem, em relação ao time:
- Número de vitórias
- Número de empates
- Número de derrotas

Considere que o final de um vetor é indicado pelo número `-1` e as entradas fornecidas são sempre válidas, i.e., o tamanho dos dois vetores de gols são iguais e cada elemento do vetor, que indica o número de gols, é um inteiro não-negativo.

## Exemplo de Entrada e Saída Esperada:

**Entrada:**  
4 0 2 3 1 3 -1  
0 0 2 5 1 2 -1

**Saída:**  
2 3 1
