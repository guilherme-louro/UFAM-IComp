import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int nota_50;
		int nota_10;
		int nota_2;

		int valor = scan.nextInt();

		if (valor%2 == 1 || valor < 0){
        	System.out.printf("Valor Invalido \n");
		}
		else {
			nota_50 = valor/50; 
			valor = valor%50;

			nota_10 = valor/10;
			valor = valor%10;

			nota_2 = valor/2;
			System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2 \n", nota_50, nota_10, nota_2);

		}
	}
}
