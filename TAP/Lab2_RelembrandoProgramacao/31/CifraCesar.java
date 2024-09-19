import java.util.Scanner;

public class CifraCesar {
    public static String cifraDeCesar(String texto, int desloc) {
        StringBuilder textoCifrado = new StringBuilder();

        for (int i = 1; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= 'a' && c <= 'z') {
                char cCifrado = (char) (((c - 'a' + desloc) % 26) + 'A');
                textoCifrado.append(cCifrado);
            }
            else if (c >= 'A' && c <= 'Z') {
                char cCifrado = (char) (((c - 'A' + desloc) % 26) + 'A');
                textoCifrado.append(cCifrado);
            }
            else {
                textoCifrado.append(c);
            }
        }
        return textoCifrado.toString();
    }

    // Função principal
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int desloc = scan.nextInt();
        String texto = scan.nextLine();

        String resultado = cifraDeCesar(texto, desloc);

        System.out.printf("%s", resultado);
    }
}
    
