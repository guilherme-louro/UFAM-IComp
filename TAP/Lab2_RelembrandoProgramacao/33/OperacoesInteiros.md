# Operações em Números Inteiros

Escreva um programa em Java (classe `OperacoesInteiros`) que leia do teclado um vetor de inteiros. Em seguida, o programa deve imprimir na ordem:

1. Quantidade de elementos
2. Quantos são pares
3. Quantos são ímpares
4. Soma total
5. Média (duas casas decimais)
6. Maior
7. Menor

O final de um vetor é determinado pelo número `-1`. Seu programa deve repetir esse procedimento indefinidamente para diversos vetores, de tamanhos variados, até que um vetor sem elementos seja inserido, terminando a execução do programa.

### Exemplo de entrada e saída esperada:

**Entrada:**  
1 5 2 8 4 -1 10 54 23 78 -1 -1

**Saída:**  
````
5 
3 
2 
20 
4.00 
8 
1 
4 
3 
1 
165 
41.25 
78 
10````

### Dica:

A classe `Integer` possui as constantes `MAX_VALUE` e `MIN_VALUE` para o maior e menor número inteiro armazenável. Exemplo:  
```java
int numero = Integer.MAX_VALUE;
