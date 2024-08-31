import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		float preco = (float) scan.nextFloat();
		
		if(preco >=200) {
			preco = preco * 0.95f;
		}
		
		System.out.printf("%.2f\n", preco);			

	}

}
