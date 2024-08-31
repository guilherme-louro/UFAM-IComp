import java.util.Scanner;

public class MediaColecao {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double media;
		double size = 0;
		double sum = 0;
		
		int number = scan.nextInt();
		while (number != -1 ) {
			sum += number;
			size++;
			number = scan.nextInt();
		}
	
		media = sum/size;
		System.out.printf("%.2f\n", media);			
	}
}
