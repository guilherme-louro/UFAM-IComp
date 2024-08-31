import java.util.Scanner;

public class Fahrenheit{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int numbers[] = new int[100];
		
		int tamanho = 0;
		
		int n = scan.nextInt();
		while (n != -1) {
			numbers[tamanho] = n;
			tamanho++;
			n = scan.nextInt();
		}
		
		for (int i = 0; i < tamanho; i++) {
			if (numbers[i]%2 == 0) {
				System.out.printf("PAR \n");
			}
			else {
				System.out.printf("IMPAR \n");
			}
		}
	}
}
