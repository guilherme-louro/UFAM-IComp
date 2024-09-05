import java.util.Scanner;

public class NumeroNarcisista {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double number = scan.nextInt();

		double k = 1;
		double mod = number%Math.pow(10, k);

		while (mod > 0){
			k++;
			mod = number%Math.pow(10, k);
		}
		System.out.printf("%f", k);

		double number_narc = 0;

		for (double i = k; i > 0; i--) {
			double digit = number/Math.pow(10, i);
			digit = Math.floor(digit);
			number_narc = number_narc + Math.pow(digit, k);
		}

		if (number_narc == number) {
			System.out.printf("SIM \n");			
		}
		else {
			System.out.printf("NAO \n");			
		}
	}

}
