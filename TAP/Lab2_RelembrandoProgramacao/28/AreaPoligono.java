import java.util.Scanner;

public class AreaPoligono {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		double x[] = new double[100];
		double y[] = new double[100];

		int i = 0;
		int n = 0;
		
		double number = scan.nextDouble(); 
		x[i] = number;
		i++;

		 while (number != -1){
			number = scan.nextDouble();
            x[i] = number;
            i++;
			n++;
		}

		i = 0;
		number = scan.nextDouble(); 
		y[i] = number;
		i++;
		
        while (number != -1){
            number = scan.nextDouble();
            y[i] = number;
            i++;
		}

		double sum = 0;

		for (int a = 0; a < n-2; a++) {
			double sum_x = (x[a+1] + x[a]);
			double sum_y = (y[a+1] - y[a]);
			sum = sum + sum_x * sum_y;
		}

		double area = Math.abs(sum)/2;

		System.out.printf("%.4f", area);
	}
}
