import java.util.Scanner;

public class PorcentagemAcerto {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int resposta[] = new int[100];
		int gabarito[] = new int[100];
		
		int i;
		
		i = 0;
		int n = scan.nextInt();
		while (n != -1) {
			resposta[i] = n;
			i++;
			n = scan.nextInt();
		}
		
		double questoes = 0;
		i = 0;
		n = scan.nextInt();
		while (n != -1) {
			gabarito[i] = n;
			i++;
			questoes++;
			n = scan.nextInt();
		}

		double acertos = 0;	
		for (int j=0; j<questoes; j++) {
			if (resposta[j] == gabarito[j]) {
				acertos++;
			}
		}
		
		double media = (acertos/questoes) * 100;
		System.out.printf("%.2f \n", media);
           
	}

}
