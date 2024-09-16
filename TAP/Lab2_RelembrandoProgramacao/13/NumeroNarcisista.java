import java.util.Scanner;

public class NumeroNarcisista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if (ehNarcisista(numero)) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }

        scanner.close();
    }

    public static boolean ehNarcisista(int numero) {
        String numStr = String.valueOf(numero);
        int n = numStr.length(); // Número de dígitos
        int soma = 0;
        int temp = numero;

        while (temp > 0) {
            int digito = temp % 10;
            soma += Math.pow(digito, n);
            temp /= 10;
        }

        return soma == numero;
    }
}
