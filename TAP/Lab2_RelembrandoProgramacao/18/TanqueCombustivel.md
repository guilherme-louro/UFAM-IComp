# Descrição do Problema

Um tanque de combustível tem o formato esférico. Escreva um programa (classe `TanqueCombustivel`) que leia o valor do raio \( r \) do tanque, o valor da altura do ar \( h \), e a opção para calcular o volume de ar (opção 1) ou o volume de combustível no tanque (opção 2).

## Fórmulas:

- Volume da esfera de raio \( r \):

$$
V_{esfera} = \frac{4}{3} \pi r^3
$$

- Volume da calota esférica de raio \( r \) e altura \( h \):

$$
V_{calota} = \frac{\pi h^2 (3r - h)}{3}
$$

## Exemplos de Entrada e Saída Esperada:

- **Entrada:** 30 27 1  
  **Saída:** 48094.6419

- **Entrada:** 30 27 2  
  **Saída:** 65002.6936

## Dica:

- O volume de ar corresponde à fórmula da calota esférica.
- O volume do combustível corresponde ao complemento do volume da calota esférica em relação ao volume total da esfera.
- A saída do programa deverá ser o volume conforme a opção selecionada, com quatro casas decimais de precisão.
