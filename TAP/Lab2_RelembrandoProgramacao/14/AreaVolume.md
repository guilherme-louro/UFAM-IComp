# Descrição do Problema

Escreva um programa (classe `AreaVolume`) que leia o valor de um raio \( r \), inserido a partir do teclado. O programa deverá mostrar a área de um círculo com o raio \( r \) e o volume de uma esfera com raio \( r \), de acordo com o exemplo abaixo. Para esta questão, use apenas variáveis do tipo `double`.

## Exemplo de Entrada e Saída Esperada:

- **Entrada:** 45
- **Saída:**
  - Um círculo com raio de 45.00 centímetros tem uma área de 6361.73 centímetros quadrados.
  - Uma esfera com raio de 45.00 centímetros tem um volume de 381703.51 centímetros cúbicos.

## Fórmulas:

- A área de um círculo é dada pela fórmula:

$$
A = \pi r^2
$$

- O volume de uma esfera é dado pela fórmula:

$$
V = \frac{4}{3} \pi r^3
$$

## Dicas:

- Use apenas variáveis do tipo `double` para não perder precisão e evitar erros na correção automática.
- Use a constante `PI` presente na classe `Math` do Java para pegar o valor de \( \pi \). Exemplo: `double pi = Math.PI;`
- Note que em Java, `1/3 = 1`, enquanto que `1.0/3.0 = 0.333...`.
- Para calcular uma exponenciação em Java, use o método `Math.pow(double a, double b)`. Exemplo: `double exp = Math.pow(2, 8);`
