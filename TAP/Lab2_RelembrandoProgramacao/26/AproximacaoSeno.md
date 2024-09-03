# Descrição do Problema

O seno de um ângulo \( \theta \), medido em radianos, \( \sin(\theta) \), pode ser calculado através da seguinte série de Taylor:

$$
\sin(\theta) = \theta - \frac{\theta^3}{3!} + \frac{\theta^5}{5!} - \frac{\theta^7}{7!} + \ldots
$$

Escreva um programa (classe `AproximacaoSeno`) que leia um ângulo, medido em graus, e o número \( k \) de termos da série, nessa ordem, e imprima o valor da série com dez casas decimais de precisão para cada um dos termos, de 1 a \( k \). Para esta questão, use apenas variáveis do tipo `double`.

## Dicas:

- Use apenas variáveis do tipo `double` para não perder precisão e não dar erro na correção automática.
- Determine o termo geral da série antes de começar a programar.
- Para converter a entrada do usuário de graus para radianos use o método `toRadians(double angdeg)` da classe `Math`. Exemplo: `double radians = Math.toRadians(45);`
- Java não possui uma implementação do cálculo de fatorial. Você precisará implementar dentro do seu `main` ou criar um método (função) para fazer isso.

## Exemplos de Entrada e Saída Esperada:

- **Entrada:** 45 2  
  **Saída:**  
  0.7853981634  
  0.7046526512

- **Entrada:** 90 8  
  **Saída:**  
  1.5707963268  
  0.9248322293  
  1.0045248555  
  0.9998431014  
  1.0000035426  
  0.9999999437  
  1.0000000007  
  1.0000000000
