# Descrição do Problema

Considere um triângulo cujos lados sejam designados por \( a \), \( b \), e \( c \). Considere ainda que \( s = \frac{a + b + c}{2} \). A área do triângulo pode ser calculada usando a seguinte fórmula:

\[
\text{Área} = \sqrt{s(s-a)(s-b)(s-c)}
\]

Escreva um programa em Java (nome da classe: `AreaTriangulo`) que leia os comprimentos dos lados de um triângulo e mostre a sua área com duas casas decimais. Assuma que as entradas podem também corresponder a um triângulo inválido. Neste caso, imprima a mensagem "Triangulo invalido".

## Exemplo de Entrada e Saída Esperada:

**Entrada:** 4 8 6  
**Saída:** 11.62

## Dicas:

- Em um triângulo, a soma dos comprimentos de quaisquer dois lados é maior que o comprimento do terceiro lado [Wiki].
- Para calcular uma raiz quadrada em Java, usa-se o método `sqrt(double a)` da classe `Math`. Exemplo: `double raiz = Math.sqrt(24601);`
- Para imprimir algo formatado em Java, use o método `System.out.printf(String format, Object... args)`. Exemplo: `System.out.printf("%.3f\n", media);`
- Você pode representar os números reais usando `float` ou `double`.
- Em Java, um número real isolado (e.g., 1.21) é considerado como sendo do tipo `double`. Para usar um número como sendo do tipo `float`, use o 'f' ao final do número (e.g., 1.21f).
- Java converte automaticamente tipos quando não há perda de precisão. Exemplo: `double nota = 8.7f; // Converte de float para double automaticamente`
- Entretanto, quando há perda de precisão, isso não é possível e o uso do cast é obrigatório. Exemplo: `float nota = (float) 8.7; // Converte de double para float usando o cast`
