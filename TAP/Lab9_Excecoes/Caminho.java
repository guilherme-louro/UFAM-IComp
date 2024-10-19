package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {

    private Coordenada[] caminho; 
    private int tamanho;    
    private final int maxTam;          
    private static final double DISTANCIA_MAXIMA = 15.0;  // Distância máxima permitida entre dois pontos

    public Caminho(int maxTam) {
        this.maxTam = maxTam;
        this.caminho = new Coordenada[maxTam];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void addCoordenada(Coordenada coordenada)
            throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {
        if (tamanho >= maxTam) {
            throw new TamanhoMaximoExcedidoException();
        }

        if (tamanho > 0) {
            Coordenada ultimaCoordenada = caminho[tamanho - 1];
            double distancia = ultimaCoordenada.distancia(coordenada);
            if (distancia > DISTANCIA_MAXIMA) {
                throw new DistanciaEntrePontosExcedidaException();
            }
        }

        caminho[tamanho] = coordenada;
        tamanho++;
    }

    public void reset() {
        this.caminho = new Coordenada[maxTam];  
        this.tamanho = 0;  
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados do caminho:\n");
        sb.append("  - Quantidade de pontos: ").append(tamanho).append("\n");
        sb.append("  - Pontos:\n");
        for (int i = 0; i < tamanho; i++) {
            sb.append("    -> ").append(caminho[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
