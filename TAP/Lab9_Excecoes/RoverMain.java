package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
    public static void main(String[] args) {
        // Define um tamanho máximo para o caminho do Rover
        Caminho caminho = new Caminho(10);  // Caminho com até 10 coordenadas
        
        try {
            // Simula a recepção de coordenadas da central de comando
            caminho.addCoordenada(new Coordenada(32, 30, 2)); 
            caminho.addCoordenada(new Coordenada(35, 40, 5)); 
            caminho.addCoordenada(new Coordenada(38, 30, 8)); 
            caminho.addCoordenada(new Coordenada(30, 36, 6)); 
            caminho.addCoordenada(new Coordenada(40, 36, 6)); 
            
            caminho.addCoordenada(new Coordenada(60, 60, 0)); 

            System.out.println(caminho.toString());

        } catch (TamanhoMaximoExcedidoException | DistanciaEntrePontosExcedidaException e) {
            // Captura qualquer erro de exceção do Rover e imprime a mensagem
            System.err.println("Erro no caminho do Rover: " + e.getMessage());
            
            // Reseta o caminho para evitar que o Rover siga um caminho inválido
            caminho.reset();
            System.out.println("Caminho resetado devido a erro.");
        } catch (RoverException e) {
            // Captura qualquer outro erro relacionado ao Rover
            System.err.println("Erro genérico no Rover: " + e.getMessage());
            caminho.reset();
            System.out.println("Caminho resetado devido a erro.");
        }
    }
}