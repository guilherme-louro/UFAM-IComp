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
        int altura = jogo.getAltura(); // número de linhas
        int largura = jogo.getLargura(); // número de colunas

        LinkedList<Point> segmentosCobra = jogo.getSegmentos();
        if (segmentosCobra.size() == (altura * largura - 1)) {
            return 'N';
        }

        Point cabeca = segmentosCobra.getFirst();
        Point posicaoComida = jogo.getComida();

        ArrayList<Character> possiveisDirecoes = new ArrayList<>(2); 
        char direcaoPreferida = 'N';
        double menorDistancia = Integer.MAX_VALUE;

        // Add as possíveis direções da cobra
        if (jogo.isCelulaLivre(cabeca.x, cabeca.y - 1) && cabeca.x % 2 == 1) {
            possiveisDirecoes.add('C'); 
        }

        if (jogo.isCelulaLivre(cabeca.x + 1, cabeca.y) && cabeca.y % 2 == 1) {
            possiveisDirecoes.add('D');

        }
        if (jogo.isCelulaLivre(cabeca.x, cabeca.y + 1) && cabeca.x % 2 == 0) {
            possiveisDirecoes.add('B'); 

        }
        if (jogo.isCelulaLivre(cabeca.x - 1, cabeca.y) && cabeca.y % 2 == 0) {
            possiveisDirecoes.add('E'); 
        }

        for (char direcao : possiveisDirecoes) {
            Point novaPosicao = new Point(cabeca);

            switch (direcao) {
                case 'C' -> novaPosicao.y -= 1;
                case 'B' -> novaPosicao.y += 1;
                case 'E' -> novaPosicao.x -= 1;
                case 'D' -> novaPosicao.x += 1;
            }

            if (jogo.isCelulaLivre(novaPosicao.x, novaPosicao.y)) {
                double distancia = Math.sqrt(Math.pow(novaPosicao.x - posicaoComida.x, 2) + Math.pow(novaPosicao.y - posicaoComida.y, 2));

                if (distancia < menorDistancia) {
                    menorDistancia = distancia;
                    direcaoPreferida = direcao;
                } 
                else if (distancia == menorDistancia) {
                    Random random = new Random();
                    direcaoPreferida = possiveisDirecoes.get(random.nextInt(possiveisDirecoes.size()));
                }
            }
        }    
        return direcaoPreferida;
    }
}   