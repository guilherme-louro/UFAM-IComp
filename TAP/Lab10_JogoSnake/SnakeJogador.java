import java.awt.Point;
import java.util.*;

/**
 * Classe de exemplo para a implementação de um Jogador para o Jogo Snake.
 * Nesta implementação, a próxima direção da cobra é escolhida aleatoriamente
 * entre as direções possíveis (que não geram colisões).
 * <p>
 * Use esta classe como base inicial para a sua solução do jogo. Basicamente
 * você precisará reimplementar o método {@code getDirecao}.
 * 
 * @author Horácio
 */

public class SnakeJogador {
    private Snake jogo;
    
    /**
     * Cria um novo jogador para o jogo passado como parâmetro.
     * @param jogo jogo snake.
     */
    public SnakeJogador(Snake jogo) {
        this.jogo = jogo;
    }

    /**
     * Executado pelo método {@link Snake#inicia()} a cada 'tick' do jogo para
     * perguntar qual a próxima direção da cobra ('C'ima, 'D'ireita, 'B'aixo,
     * 'E'squerda ou 'N'enhum).
     * 
     * @return a próxima direção da cobra.
     */
    public char getDirecao() {
        LinkedList<Point> segmentosCobra = jogo.getSegmentos();

        // Pega a cabeça da cobra
        Point cabeca = segmentosCobra.getFirst();

        // Lista de direções possíveis
        ArrayList<Character> possiveisDirecoes = new ArrayList<>(4);

        // Adiciona direções possíveis
        if (jogo.isCelulaLivre(cabeca.x, cabeca.y - 1)) {
            possiveisDirecoes.add('C'); // Cima

                }if (jogo.isCelulaLivre(cabeca.x + 1, cabeca.y)) {
            possiveisDirecoes.add('D'); // Direita

                }if (jogo.isCelulaLivre(cabeca.x, cabeca.y + 1)) {
            possiveisDirecoes.add('B'); // Baixo

                }if (jogo.isCelulaLivre(cabeca.x - 1, cabeca.y)) {
            possiveisDirecoes.add('E'); // Esquerda
        }
        // Se não há direções disponíveis, retorna 'N'
        if (possiveisDirecoes.isEmpty()) {
            return 'N';
        }

        // Lógica para priorizar a direção em direção à comida
        char direcaoPreferida = 'N';
        int menorDistancia = Integer.MAX_VALUE;

        // Obtenha a posição da comida a partir da instância do jogo
        Point posicaoComida = jogo.getComida();

        for (char direcao : possiveisDirecoes) {
            Point novaPosicao = new Point(cabeca);

            // Calcula a nova posição com base na direção
            switch (direcao) {
                case 'C':
                    novaPosicao.y -= 1;
                    break; // Cima
                case 'D':
                    novaPosicao.x += 1;
                    break; // Direita
                case 'B':
                    novaPosicao.y += 1;
                    break; // Baixo
                case 'E':
                    novaPosicao.x -= 1;
                    break; // Esquerda
            }

            // Calcula a distância até a comida
            int distancia = Math.abs(novaPosicao.x - posicaoComida.x) + Math.abs(novaPosicao.y - posicaoComida.y);

            // Se a distância até a comida for menor que a menor distância encontrada
            if (distancia < menorDistancia) {
                menorDistancia = distancia;
                direcaoPreferida = direcao;
            }
        }

        // Retorna a direção preferida que leva à comida
        return direcaoPreferida;
    }

        // andar em x e y para chegar na comida

        // quando chegar na comida, partir para uma das pontas 
        // e circular até repetir dnv 
        
        /*
         * IMPLEMENTE AQUI A SUA SOLUÇÃO PARA O JOGO
         */
        
        // ArrayList<Character> possiveisDirecoes = new ArrayList<Character>(4);
        // Point cabeca = jogo.getSegmentos().getFirst();
        
        // // Adiciona as possíveis direções na lista
        // if (jogo.isCelulaLivre(cabeca.x, cabeca.y-1)) possiveisDirecoes.add('C'); // Cima
        // if (jogo.isCelulaLivre(cabeca.x+1, cabeca.y)) possiveisDirecoes.add('D'); // Direita
        // if (jogo.isCelulaLivre(cabeca.x, cabeca.y+1)) possiveisDirecoes.add('B'); // Baixo
        // if (jogo.isCelulaLivre(cabeca.x-1, cabeca.y)) possiveisDirecoes.add('E'); // Esquerda
        
        // // Não existe mais nenhuma direção disponível
        // if (possiveisDirecoes.size() == 0) return 'N';
        
        // // Pega um número aleatório entre 0 e o tamanho da lista e retorna a direção
        // int posicao = new Random().nextInt(possiveisDirecoes.size());
        // return possiveisDirecoes.get(posicao);
}   