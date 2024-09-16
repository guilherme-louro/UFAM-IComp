import java.util.Scanner;

public class Xadrez {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		for (int i = 0; i<n; i++) {
			if(i%2 == 0) {
				for (int a = 0; a<n; a++) {
					System.out.print("* ");
				}
			}
			else {
				for (int a = 0; a<n; a++) {
					System.out.print(" *");
				}
			}
			System.out.print("\n");
		}
	}

}
