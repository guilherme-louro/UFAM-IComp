import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		float a = (float) scan.nextFloat();
		float b = (float) scan.nextFloat();
		float c = (float) scan.nextFloat();

		float media = (a+b+c)/3;
		
		System.out.printf("%.2f \n", media);
           
	}

}
