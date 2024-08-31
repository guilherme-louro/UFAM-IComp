
import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float celcius = (float) scan.nextFloat();

        float fahrenheit = (9 * celcius) / 5 + 32;

        System.out.printf("%.1f", fahrenheit);
    }
}

