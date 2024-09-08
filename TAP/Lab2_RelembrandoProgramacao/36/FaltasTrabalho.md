# Descrição do Problema

O setor de Recursos Humanos (RH) de uma empresa está preocupado com as faltas de seus empregados ao trabalho. Como estudo inicial, o RH deseja determinar quantas faltas acontecem em cada dia de semana de trabalho (segunda a sábado).

Um vetor armazena o histórico de faltas registradas na empresa. Cada posição armazena um número que representa o dia da semana em que algum empregado faltou ao trabalho. O número `2` indica que houve uma falta na segunda-feira, `3` indica uma falta em dia de terça-feira, e assim por diante, até o número `7`, que indica uma falta em dia de sábado.

Escreva um programa (classe `FaltasTrabalho`) que leia esse vetor, de tamanho qualquer e finalizado pelo número `-1`. Na saída, o programa deve imprimir seis números contendo o percentual de faltas que aconteceram na segunda, terça, ..., até sábado, nesta ordem, com uma casa decimal de precisão. Considere que a entrada fornecida é sempre válida.

## Exemplo de Entrada e Saída Esperada:

**Entrada:**  
2 2 2 3 3 7 7 7 7 7 -1

**Saída:**  
30.0 20.0 0.0 0.0 0.0 50.0
