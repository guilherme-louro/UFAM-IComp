import java.util.Scanner;

public class AproximacaoPi {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double number = scan.nextDouble();
		double pi = 3;

		System.out.printf("%.6f\n", pi);
	
		double n = 1;
		for (int i = 2; i < (number + 1); i++) {
			if (i%2 == 0){
				pi = pi + 4/( (2*n) * (2*n + 1) * (2*n + 2) );
			}
			else {
				pi = pi - 4/( (2 * n) * (2 * n + 1) * (2 * n + 2));
			}
			n = n + 1;
			System.out.printf("%.6f\n", pi);
		}
	}
}
