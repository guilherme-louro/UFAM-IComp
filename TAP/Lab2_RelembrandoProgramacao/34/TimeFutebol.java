import java.util.Scanner;

public class TimeFutebol {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int golsPro[] = new int[100];		
		int golsContra[] = new int[100];	

		int partida = 0;
		int n;
		while ((n = scan.nextInt()) != -1) { 
            golsPro[partida] = n;
            partida++;
        }

		partida = 0;
		
		while ((n = scan.nextInt()) != -1) { 
            golsContra[partida] = n;
            partida++;
        }

		int vitoria = 0, empate = 0, derrota = 0;
		for (int i = 0; i < partida; i++) {
			int saldo = golsPro[i] - golsContra[i];
			if (saldo > 0){
				vitoria++;
			}
			else if (saldo < 0){
				derrota++;
			}
			else {
				empate++;
			}
		}

		System.out.printf("%d %d %d", vitoria, empate, derrota);

	}

}
