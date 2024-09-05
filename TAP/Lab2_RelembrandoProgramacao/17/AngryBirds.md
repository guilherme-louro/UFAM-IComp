# Descrição do Problema

Considere o cenário do jogo **Angry Birds**, onde um pássaro é lançado com uma velocidade inicial \( v_0 \) a partir do estilingue, cujo elástico faz um ângulo \( \theta \) com o solo.

O alcance máximo (\( R \)) do pássaro horizontalmente é dado pela seguinte equação:

\[
R = \frac{v_0^2 \cdot \sin(2\theta)}{g}
\]

onde \( v_0 \) é o valor em módulo da velocidade inicial e \( g \) é a aceleração da gravidade.

Escreva um programa (classe `AngryBirds`) que leia a velocidade inicial \( v_0 \), o ângulo \( \theta \) (em graus), e a distância horizontal \( d \) entre o pássaro e o porco, e informe se o pássaro atingirá (saída 1) ou não o porco (saída 0). Admita uma tolerância de \( 0.1 \). Ou seja, se \( R = 91.83 \) e \( d = 91.8 \), então podemos considerar que o pássaro acerta o porco.

## Exemplo de Entrada e Saída Esperada:

**Entrada:** 30 45 91.83  
**Saída:** 1

**Entrada:** 30 45 100  
**Saída:** 0

## Dicas:

- Funções trigonométricas do Java operam em radianos. Como resultado, você vai precisar converter a entrada do usuário de graus para radianos antes de calcular a distância. Para isso, use o método `toRadians(double angdeg)` da classe `Math`. Exemplo: `double radians = Math.toRadians(45);`
- Use os métodos trigonométricos da classe `Math` para calcular o seno – `Math.sin(double a)`, cosseno – `Math.cos(double a)` e arco cosseno – `Math.acos(double a)`.
