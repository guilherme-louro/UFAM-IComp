import java.util.Scanner;

public class RaizDois {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		
		double seed = 1;
		double root2;
		
		for (int i = 0; i < n; i++) {
			double sumSeed = (2 + 1/seed); 

			for (int j = 1; j < i + 1; j++) {
				sumSeed = 2 + 1/sumSeed; 
			}

			root2 = 1 + 1/sumSeed;
			System.out.printf("%.14f\n", root2);
		}
	}
}
