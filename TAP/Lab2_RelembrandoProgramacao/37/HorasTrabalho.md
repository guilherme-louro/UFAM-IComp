# Horas de Trabalho

Suponha que as horas de trabalho semanais dos funcionários de uma empresa são armazenadas em uma tabela semelhante à do exemplo abaixo. Cada linha registra o número de horas trabalhadas por um funcionário em sete colunas, uma para cada dia da semana, de domingo a sábado. Por exemplo, a tabela a seguir armazena as horas de trabalho para quatro funcionários:

|          | DOM | SEG | TER | QUA | QUI | SEX | SAB |
|----------|-----|-----|-----|-----|-----|-----|-----|
| Funcionário 0 |  2  |  4  |  3  |  4  |  5  |  8  |  8  |
| Funcionário 1 |  7  |  3  |  4  |  3  |  3  |  4  |  4  |
| Funcionário 2 |  3  |  3  |  4  |  3  |  3  |  2  |  2  |
| Funcionário 3 |  9  |  3  |  4  |  7  |  3  |  4  |  1  |

Escreva um programa (classe `HorasTrabalho`) que leia uma matriz Nx7, sendo N > 1, e imprima quantas horas cada um dos funcionários trabalhou durante a semana, um por linha. Considere o número `-1` como o final da entrada, ou seja, os 7 primeiros números correspondem ao Funcionário 0, seguido dos 7 números para o Funcionário 1, e assim por diante.

### Exemplo de entrada:
2 4 3 4 5 8 8 7 3 4 3 3 4 4 3 3 4 3 3 2 2 9 3 4 7 3 4 1 -1

### Exemplo de saída:
````
34
28
20
31
````