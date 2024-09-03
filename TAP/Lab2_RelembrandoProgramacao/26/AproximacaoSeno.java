import java.util.Scanner;

public class AproximacaoSeno {
    
	public static long fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double angle = scan.nextDouble();
		double x = Math.toRadians(angle);

		double number = scan.nextDouble();

        for (int i = 1; i < number + 1; i++) {
            double sen_x = 0;
			for (int n = 0; n < i; n++) {
				sen_x = sen_x + Math.pow(-1, n)/fatorial(2*n + 1) * Math.pow(x, 2*n + 1);
        	}
            System.out.printf("%.10f\n", sen_x);
   		}
	}
}
