import java.util.Scanner;

public class SomaColecoes {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int list[] = new int[100];
		int number;
		int i = 0;

		int numberBefore = 0;
		int inicio = 0;

		// while ((number = scan.nextInt()) != -1 && numberBefore != -1) {
        //     list[i] = number;
		// 	numberBefore = number;
        //     i++;
		// 	if (numberBefore == -1) {
		// 		int soma = 0;
		// 		for (int j = inicio; j < i; j++) {
		// 			soma += list[j];
		// 		}
		// 		inicio = i;
		// 		System.out.printf("%d", soma);
		// 	}
        // }

		while ((number = scan.nextInt()) != -1 && numberBefore != -1) {
            list[i] = number;
			numberBefore = list[i-1];
            i++;
		}
		for (int j = 0; j < i; j++) {
			System.out.printf("%d ", list[j]);
		}
		System.out.printf("Chegou aqui");
	}
}
