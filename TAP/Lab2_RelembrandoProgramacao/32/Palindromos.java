import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();
        phrase = phrase.toUpperCase().replace(" ", "");
        int phraseLength = phrase.length();

        int isPal = 1;
		int i = 0;
        while (i < phraseLength/2 && isPal == 1) {
			if (phrase.charAt(i) != phrase.charAt(phraseLength - i - 1)){
				isPal = 0;
			}
			i++;
        }
		System.out.printf("%s %d",phrase, isPal);
    }
}
