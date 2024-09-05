import java.util.Scanner;

public class AsciiArt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < 2*n; i++) {
            for (int a = 0; a < n - i; a++) {
                System.out.print('*');
            }
            for (int b = 0; b < 2*i; b++) {
                System.out.print(' ');
            }
            for (int c = 0; c < n - i; c++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
