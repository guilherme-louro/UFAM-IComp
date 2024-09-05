import java.util.Scanner;

public class SomaColecoes {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int list[] = new int[100];
		int number = scan.nextInt();

		int i = 0;

		while (list[i-1] != -1 && list[i] != -1){
			number = scan.nextInt();
			list[i] = number;
			i++;
		}

		
	}
}
