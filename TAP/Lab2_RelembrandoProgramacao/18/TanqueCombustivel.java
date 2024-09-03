import java.util.Scanner;

public class TanqueCombustivel {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		double radius = scan.nextDouble();
		double air_height = scan.nextDouble();
		int option = scan.nextInt();

		double air_volumn = (Math.PI / 3.0) * Math.pow(air_height, 2) * (3*radius - air_height);
		double tank_volumn = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3) - air_volumn;

		switch (option) {
			case 1:
				System.out.printf("%.4f", air_volumn);
				break;
			case 2:
				System.out.printf("%.4f", tank_volumn);
				break;
		}

		
	}
}
