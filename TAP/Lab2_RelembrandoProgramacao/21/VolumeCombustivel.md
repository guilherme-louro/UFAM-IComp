# Descrição do Problema

Considere um tanque de combustível com o formato descrito na figura abaixo.

## Figura: tanque de combustível

Escreva um programa (classe `VolumeCombustivel`) que calcule o volume de combustível (em litros), com três casas decimais de precisão, dadas as medidas (em metros) de altura total do tanque \( H \), nível de combustível no tanque \( h \), e raio dos bojos semi-esféricos \( r \). Caso algum dos dados sejam inválidos, a saída deve ser `-1.000`.

## Fórmulas:

### Figura: esfera

- Volume da esfera de raio \( r \):

$$
V_{esfera} = \frac{4}{3} \pi r^3
$$

- Volume da calota esférica de raio \( r \) e altura \( h \):

$$
V_{calota} = \frac{\pi h^2 (3r - h)}{3}
$$

- Volume do cilindro de raio \( r \) e altura \( H \):

$$
V_{cilindro} = \pi r^2 H
$$

## Dicas:

- Verifique as diversas possibilidades do nível de combustível \( h \) em relação à altura do tanque \( H \).
- Desenhe! Use papel e caneta para melhor visualizar as diversas variáveis e diferentes casos.
- Use a constante PI presente na classe `Math` do Java para pegar o valor de \( \pi \). Exemplo: `double pi = Math.PI;`
- Para calcular uma exponenciação em Java, usa-se o método `pow(double a, double b)` da classe `Math`. Exemplo: `double exp = Math.pow(2, 8);`

## Exemplo de Entrada e Saída Esperada:

- **Entrada:** 50 40 10  
  **Saída:** 11519.173
