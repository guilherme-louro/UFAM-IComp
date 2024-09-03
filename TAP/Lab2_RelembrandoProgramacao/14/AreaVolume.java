import java.util.Scanner;

public class AreaVolume {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double radius = (double) scan.nextDouble();
		double area;
		double volumn;

		area = Math.PI * Math.pow(radius,2);
		volumn = (4.0/3.0) * Math.PI * Math.pow(radius,3);
		
		System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados. \n", radius, area);			
		System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos. \n", radius, volumn);			

	}

}
