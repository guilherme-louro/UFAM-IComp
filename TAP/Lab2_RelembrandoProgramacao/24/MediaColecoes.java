import java.util.Scanner;

public class MediaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanho = 1;
        double soma;
        int n;

        while (tamanho > 0) {
            tamanho = 0;
            soma = 0;
            while ((n = scan.nextInt()) != -1) {
                soma += n;
                tamanho++;
            }
            if (tamanho > 0) {
				double media = soma / tamanho;
                System.out.printf("%.2f\n", media);
            }
        }
    }
}
