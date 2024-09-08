# Descrição do Problema

Na Universidade Federal do Amazonas, um aluno é aprovado em uma disciplina se atender a dois critérios: ter média igual ou superior a 5.0 e ter frequência igual ou superior a 75% da carga horária. Se sua frequência for menor que esse limiar, o aluno é reprovado por frequência, independentemente da sua nota. Por fim, o aluno é reprovado por nota se, tendo comparecido ao número mínimo de aulas, não atingiu a média exigida.

As notas dos alunos de uma classe são guardadas em um vetor de reais. A quantidade de presenças às aulas (em horas) é armazenada em outro vetor de mesmo tamanho, mas contendo elementos inteiros.

Escreva um programa (classe `AprovacaoDisciplina`) que leia o vetor de notas (reais), o vetor de presença (inteiros) e a carga horária da disciplina (inteiro), nessa ordem, usando o número `-1` para indicar o final de um vetor. Como saída, deve ser informado, em uma única linha, os seguintes dados em ordem:
- Número de alunos aprovados
- Número de alunos reprovados por nota
- Número de alunos reprovados por frequência

Considere que as entradas fornecidas são sempre válidas: notas entre 0.0 e 10.0, frequência entre 0 e a carga horária, tamanhos iguais dos vetores de notas e frequência.

## Exemplo de Entrada e Saída Esperada:

**Entrada:**  
10.0 10.0 9.0 -1  
44 45 46 -1  
60

**Saída:**  
2 0 1
