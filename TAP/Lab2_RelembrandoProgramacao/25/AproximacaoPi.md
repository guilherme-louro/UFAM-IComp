# Descrição do Problema

O valor de \( \pi \) pode ser aproximado pela seguinte série infinita:

$$
\pi \approx 3 + \frac{4}{2 \cdot 3 \cdot 4} - \frac{4}{4 \cdot 5 \cdot 6} + \frac{4}{6 \cdot 7 \cdot 8} - \ldots
$$

Escreva um programa (classe `AproximacaoPi`) que exibe \( N \) aproximações de \( \pi \), sendo \( N \) um número natural inserido pelo usuário. A primeira aproximação deve fazer uso de apenas o primeiro termo da série infinita (número 3). Cada aproximação adicional indicada pelo seu programa deve incluir mais um termo na série, fazendo uma melhor aproximação de \( \pi \) cada vez que um termo é incluído na soma. Utilize até seis casas decimais de precisão. Para esta questão, use apenas variáveis do tipo `double`.

## Dicas:

- Use apenas variáveis do tipo `double` para não perder precisão e não dar erro na correção automática.
- Determine o termo geral da série antes de começar a programar.

## Exemplos de Entrada e Saída Esperada:

- **Entrada:** 1  
  **Saída:** 3.000000

- **Entrada:** 2  
  **Saída:**  
  3.000000  
  3.166667

- **Entrada:** 5  
  **Saída:**  
  3.000000  
  3.166667  
  3.133333  
  3.145238  
  3.139683
