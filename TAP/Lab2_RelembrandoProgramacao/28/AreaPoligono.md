# Descrição do Problema

Se  pontos estão ligados formando um polígono fechado, a área  do polígono pode ser determinada pela fórmula:

\[
A = \frac{1}{2} \left| \sum_{i=1}^{n-1} (x_i y_{i+1} - y_i x_{i+1}) \right|
\]

Observe que, embora o polígono ilustrado tenha apenas seis vértices distintos, temos que  para este polígono, pois o algoritmo espera que o último ponto, , seja uma repetição do ponto inicial, .

Escreva um programa (classe `AreaPoligono`) que receba como entrada as coordenadas  dos vértices do polígono como dois vetores de valores reais, um contendo os valores das abscissas  e o outro vetor contendo os valores das respectivas ordenadas , ambos finalizados através do número `-1`. Na saída, deve-se informar a área do polígono, com quatro casas decimais de precisão.

## Condições Simplificadoras:

- Os vetores fornecidos são sempre do mesmo tamanho;
- Cada vetor possui pelo menos quatro elementos (o que garante a existência de pelo menos um triângulo);
- O primeiro e o último elementos de cada vetor de entrada são sempre iguais.

## Dicas:

- Para aplicar a função módulo no resultado do somatório, use o método `abs(double a)` da classe `Math`. Exemplo: `double sumAbs = Math.abs(sum);`
- Atenção para a condição do somatório: menor ou igual a .

## Exemplo de Entrada e Saída Esperada:

**Entrada 1:**  
4 4 7 7 9 7 4 -1  
0 7.5 7.5 3 0 0 0 -1

**Saída 1:**  
25.5000

**Entrada 2:**  
4 9 11 2 4 -1  
10 7 2 2 10 -1

**Saída 2:**  
45.5000

## Fonte:
Hanly & Koffman. “Problem Solving and Program Design in C”, 5th edition. Pearson, 2007. (p. 423)
