import java.util.Scanner;

public class NumeroNarcisista {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double number = scan.nextInt();

		double k = 1;
		double mod = number%Math.pow(10, k);

		while (mod != 0){
			k++;
			mod = number%Math.pow(10, k);
		}

		System.out.printf("%f", k);

		int number_narc = 0;

		for (int i = 0; i < k; i++) {
			
		}
		
		System.out.printf("SIM \n");			
		System.out.printf("NAO \n");			

	}

}
