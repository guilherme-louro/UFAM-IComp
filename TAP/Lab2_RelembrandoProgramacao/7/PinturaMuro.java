import java.util.Scanner;

public class PinturaMuro {
	   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float material = 100;

        float comprimento = 12;
		float largura = 3;
		float area = comprimento * largura;

		float preco = scan.nextFloat();

		float precoMuro = preco * area + material;

        System.out.printf("%.1f \n", precoMuro);
           
	}
}
