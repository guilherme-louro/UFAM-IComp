import java.util.Scanner;

public class AngryBirds {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		double inicialVelocity = scan.nextDouble();
        double alpha = scan.nextDouble();
        double x_distance = scan.nextDouble();

		double gravity = 9.8;

		double alphaRadians = Math.toRadians(alpha);
		double sin2a = Math.sin(2*alphaRadians);

		double range = Math.pow(inicialVelocity, 2) * sin2a / gravity;

		if ( x_distance >= (range - 0.1) && x_distance <= (range + 0.1) ) {
			System.out.printf("1");
		}
		else {
			System.out.printf("0");
		}
	}
}
