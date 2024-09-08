## Problema: Distância Percorrida pelo Avião

### Contextualização
O tempo que um determinado avião dispensa para percorrer o trecho entre duas cidades distintas está disponível através da seguinte tabela:

|     | 111 | 222 | 333 | 444 | 555 | 666 | 777 |
|-----|-----|-----|-----|-----|-----|-----|-----|
| 111 | 0   | 2   | 11  | 6   | 15  | 11  | 1   |
| 222 | 2   | 0   | 7   | 12  | 4   | 2   | 15  |
| 333 | 11  | 7   | 0   | 11  | 8   | 3   | 13  |
| 444 | 6   | 12  | 11  | 0   | 10  | 2   | 1   |
| 555 | 15  | 4   | 8   | 10  | 0   | 5   | 13  |
| 666 | 11  | 2   | 3   | 2   | 5   | 0   | 14  |
| 777 | 1   | 15  | 13  | 1   | 13  | 14  | 0   |

### Objetivo
Escreva um programa (classe `DistanciaAviao`) que, tendo a tabela acima armazenada como uma matriz, leia uma sequência de números correspondentes às cidades dessa tabela até que o número `-1` seja lido. Em seguida, mostre ao usuário o tempo necessário para percorrer o circuito de cidades por ele informadas.

### Exemplos de Entrada e Saída Esperada:

- **Entrada:** `222 444 333 555 -1`
  - **Saída:** `31`

- **Entrada:** `777 111 777 -1`
  - **Saída:** `2`

### Dica
Em Java, você pode inicializar um vetor ou matriz diretamente com seus dados. Exemplo de inicialização de um vetor: `int[] code = { 4, 5, 1 };`
