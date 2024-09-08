import java.util.Scanner;

public class DistanciaAviao {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		// distanciaEntreCidades[origem][destino]
		int[][] distanciaEntreCidades = {
		//  {0, 1,  2,  3,  4,  5,  6, 7}
			{0, 0,  0,  0,  0,  0,  0, 0},
			{0, 0,  2, 11,  6, 15, 11, 1},
			{0, 2,  0,  7, 12,  4,  2, 15},
			{0, 11, 7,  0, 11,  8,  3, 13},
			{0, 6, 12, 11,  0, 10,  2, 1},
			{0, 15, 4,  8, 10,  0,  5, 13},
			{0, 11, 2,  3,  2,  5,  0, 14},
			{0, 1, 15, 13,  1, 13, 14, 0}
        };

		int[] voo = new int[100];

		int cidade;
		int qdteVoos = 0;
		while ((cidade = scan.nextInt()) != -1) { 
			voo[qdteVoos] = cidade;
			qdteVoos++;
		}

		int origem = 0;
		int destino = voo[0] / 111; 
		int tempoVoo = distanciaEntreCidades[origem][destino];

		for (int t = 0; t < qdteVoos; t++) {
			origem = voo[t] / 111; 
			destino = voo[t+1] / 111; 

			tempoVoo += distanciaEntreCidades[origem][destino];
		}
		System.out.printf("%d", tempoVoo);
	}
}
