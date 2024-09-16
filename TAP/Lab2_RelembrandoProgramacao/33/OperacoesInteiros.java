import java.util.Scanner;

public class OperacoesInteiros {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		float consumo = (float) scan.nextFloat();
		char tipo_instalacao = scan.next().charAt(0);
		float preco = -1.00f;
		
		if (consumo >=0){
			switch (tipo_instalacao) {
				case 'R':
					if (consumo < 500) {
						preco = consumo * 0.40f;
					}
					else {
						preco = consumo * 0.65f;
					}
					break;
				case 'C':
					if (consumo < 1000) {
						preco = consumo * 0.55f;
					}
					else {
						preco = consumo * 0.60f;
					}
					break;
				case 'I':
					if (consumo < 5000) {
						preco = consumo * 0.55f;
					}
					else {
						preco = consumo * 0.60f;
					}
					break;
			}
		}
		System.out.printf("%.2f", preco);
	}
}
