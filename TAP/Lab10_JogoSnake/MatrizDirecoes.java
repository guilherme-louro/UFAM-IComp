public class MatrizDirecoes {
    public static void main(String[] args) {
        int altura = 6;
        int largura = 6;
        String[][] matrizDeDirecoes = new String[altura][largura];

        // Preenchendo as bordas
        // Superior
        for (int j = 1; j < largura - 1; j++) {
            matrizDeDirecoes[0][j] = (j % 2 == 0) ? "BE" : "D";
        }

        // Inferior
        for (int j = 1; j < largura - 1; j++) {
            matrizDeDirecoes[altura - 1][j] = (j % 2 == 0) ? "C" : "CE";
        }

        // Esquerda
        for (int i = 1; i < altura - 1; i++) {
            matrizDeDirecoes[i][0] = (i % 2 == 0) ? "BD" : "B";
        }

        // Direita
        for (int i = 1; i < altura - 1; i++) {
            matrizDeDirecoes[i][largura - 1] = (i % 2 == 0) ? "C" : "CD";
        }

        // Preenchendo o meio
        for (int i = 1; i < altura - 1; i++) {
            for (int j = 1; j < largura - 1; j++) {
                if (i % 2 == 0) {
                    matrizDeDirecoes[i][j] = (j % 2 == 0) ? "BE" : "BD";
                } else {
                    matrizDeDirecoes[i][j] = (j % 2 == 0) ? "CE" : "CD";
                }
            }
        }

        // Imprimindo a matriz
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print(matrizDeDirecoes[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
