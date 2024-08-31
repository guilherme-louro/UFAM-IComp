import java.util.Scanner;

public class ArteAscii {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();

		int n_star = n;
		
		while (n_star > 0){
			for (int j = 0; j < n_star; j++){
				System.out.print('*');
			}
			System.out.println();
			n_star--;
		}

		n_star = 1;
		while (n_star <= n) {
			for (int j = 0; j < n_star; j++) {
				System.out.print('*');
			}
			System.out.println();
			n_star++;
		}
	}

}
