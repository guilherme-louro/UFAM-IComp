# Descrição do Problema

Um número narcisista é um número que segue a seguinte regra:

$$
n = a_1^m + a_2^m + \dots + a_m^m
$$

onde \( m \) é a quantidade de dígitos do número. Por exemplo, o número 153 é um número narcisista, pois:

$$
153 = 1^3 + 5^3 + 3^3
$$

Desenvolva um programa (classe `NumeroNarcisista`) que leia um número inteiro do teclado e exiba `"SIM"` se ele for um número narcisista ou `"NAO"`, caso contrário.

## Dicas:

- Use o operador de resto da divisão (`%`).
- Para calcular uma exponenciação em Java, use o método `Math.pow(double a, double b)`. Exemplo: `double exp = Math.pow(2, 8);`
