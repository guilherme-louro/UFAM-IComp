import java.util.Scanner;

public class ValorExpoente {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int number = scan.nextInt();
		int k = 1; 
		int sum = 2;
		
		while (sum <= number) { 
			k++;
			sum += Math.pow(2, k);
		}
        System.out.printf("%d", k);
	}

}
