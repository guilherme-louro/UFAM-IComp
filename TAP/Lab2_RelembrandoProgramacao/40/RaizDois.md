# Fração Contínua: Raiz Quadrada de Dois

## Contextualização
Seja $\mathbb{Z}$ o conjunto dos números inteiros. Sabemos que a quantidade de elementos em $\mathbb{Z}$ é infinita. Contudo, tomando-se dois números inteiros $a$ e $b$ quaisquer, com $a < b$, teremos uma quantidade finita de elementos $x$ tais que $a \leq x \leq b$, ou seja, compreendidos entre $a$ e $b$. Por outro lado, no conjunto $\mathbb{R}$ dos números reais, tomando-se dois elementos $a$ e $b$ quaisquer, com $a < b$, teremos uma quantidade infinita de elementos $x$ tais que $a \leq x \leq b$. Esse fato dificulta a representação de números reais em máquinas com recursos limitados de armazenamento, tais como os computadores. Uma vez que a memória de qualquer computador é finita, não há como representar nela todos os números reais, cuja quantidade é infinita.

Uma maneira de contornar esse problema é utilizar frações contínuas (assunto desta questão) para representar números reais, pois elas nos fornecem aproximações racionais surpreendentemente boas de números reais, além de serem conceitualmente simples. De um modo geral, uma fração contínua é uma expressão da seguinte forma:

$$
x = a_0 + \cfrac{1}{a_1 + \cfrac{1}{a_2 + \cfrac{1}{a_3 + \ddots}}}
$$

Note que a expressão acima também é infinita, tal como uma dízima periódica. Quando usamos um algoritmo para computar uma série infinita, como a série $\sum$ abaixo, nós conhecemos o primeiro termo (neste caso, é o termo 1), mas não conhecemos o último termo.

$$
\sum_{n=1}^{\infty} \frac{1}{n^2}
$$

Por outro lado, quando usamos um algoritmo para computar uma fração contínua, como no exemplo abaixo, nós não conhecemos o primeiro termo, pois ele remonta ao infinito (simbolizado pelo $\infty$):

$$
\sqrt{2} = 1 + \cfrac{1}{2 + \cfrac{1}{2 + \cfrac{1}{2 + \ddots}}}
$$

Por conta disso, ao tratar frações contínuas de forma algorítmica, somos obrigados a arbitrar um começo qualquer, o qual chamamos de "semente". Embora a escolha da semente seja arbitrária, o que influencia a qualidade da aproximação é o número de passos (divisões) que resolvemos a fração contínua. Escolhamos apenas um passo:

$$
\sqrt{2} \approx 1 + \cfrac{1}{2} = 1.5
$$

Por exemplo, se arbitrarmos que semente=10, o resultado aproximado da fração acima será o seguinte:

$$
\sqrt{2} \approx 1.5
$$

distante do valor esperado, que é $\sqrt{2} \approx 1.4142135623731$. Contudo, usando esse mesmo valor de semente na aproximação abaixo,

$$
\sqrt{2} \approx 1 + \cfrac{1}{2 + \cfrac{1}{2}} = 1.4166666666667
$$

o resultado será $1.4166666666667$, que é bem mais próximo do valor esperado. Além disso, note que a fração contínua de $\sqrt{2}$ é composta por duas partes:
- **Constante:** o número 1 logo após o sinal de "aproximado".
- **Cíclica:** $2 + \cfrac{1}{2 + \cfrac{1}{2 + \ddots}}$

**Problema**  
Escreva um programa (classe `RaizDois`) que leia um número $N$ do teclado e determine o valor de $\sqrt{2}$ através da sua expansão em fração contínua com $N$ termos. Na saída, devem ser mostrados os resultados intermediários, com 14 casas decimais de precisão. Utilize uma semente igual a 1. Para esta questão, use apenas variáveis do tipo `double`.


### Exemplos de entrada e saída esperada:
- **Entrada:** 1

  **Saída:** 
``` 
1.33333333333333
```

- **Entrada:** 2

  **Saída:** 
```
1.33333333333333
1.42857142857143
```

- **Entrada:** 5

  **Saída:** 
```
1.33333333333333
1.42857142857143
1.41176470588235
1.41463414634146
1.41414141414141
```
