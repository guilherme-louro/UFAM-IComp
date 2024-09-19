import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

		int vetor[] = new int [100];

        int tamanho = 1;
		int par = 0;
		int impar = 0;
        double soma;
		double media;
		double maior = -1;
		double menor = Math.pow(2, 15);

        while (tamanho > 0) {
            tamanho = 0;
            soma = 0;
            while ((n = scan.nextInt()) != -1) {
                vetor[tamanho] = n;
                tamanho++;
            }
            if (tamanho > 0) {
                for (int i = 0; i < tamanho; i++) {
					soma += vetor[i];
					maior = Math.max(vetor[i], maior);
					menor = Math.min(vetor[i], menor);
					if (vetor[i]%2 == 0) {
						par++;
					}
					else {
						impar++;
					}
				}
				media = soma / tamanho;
                System.out.printf("%d\n", tamanho);
                System.out.printf("%d\n", par);
                System.out.printf("%d\n", impar);
                System.out.printf("%.0f\n", soma);
                System.out.printf("%.2f\n", media);
                System.out.printf("%.0f\n", maior);
                System.out.printf("%.0f\n", menor);
            }
			
			par = 0;
			impar = 0;
			soma = 0;
			maior = -1;
			menor = Math.pow(2, 15);
        }
    }
}
