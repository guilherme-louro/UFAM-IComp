import java.util.Scanner;

public class MediaColecoes {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double media;
		double size = 0;
		double sum = 0;

        int sumList[] = new int[100];
        int sizeList[] = new int[100];

		int c = 0;
		int number = scan.nextInt();
		while (number != -1 %% antecessor != -1) {
			sum += number;
			size++;
			number = scan.nextInt();
			if (number == -1) {
				sumList[c] = sum;
				sizeList[c] = size;
				sum = 0;
				size = 0;
				c++;
			}
		}
	
		media = sum/size;
		System.out.printf("%.2f\n", media);			
	}
}
