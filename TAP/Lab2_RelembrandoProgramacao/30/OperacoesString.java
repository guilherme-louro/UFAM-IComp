import java.util.Scanner;

public class OperacoesString {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String word = scan.nextLine();


		int wordLen = word.length();
		char firstChar = word.charAt(0);
		char lastChar = word.charAt(wordLen-1);
		String upperCase = word.toUpperCase();
		String lowerCase = word.toLowerCase();
		String switchAtoE = word.replace('a', 'e');

		StringBuilder evens = new StringBuilder();
        for (int i = 0; i < wordLen; i += 2) {
            evens.append(word.charAt(i));
        }
		int sumVowels = sumWordVowels(word);
		

		System.out.printf("%d \n", wordLen);
		System.out.printf("%c \n", firstChar);
		System.out.printf("%c \n", lastChar);
		System.out.printf("%s \n", upperCase);
		System.out.printf("%s \n", lowerCase);
		System.out.printf("%s \n", switchAtoE);
		System.out.printf("%s \n", evens);
		System.out.printf("%d", sumVowels);
	}

	private static int sumWordVowels(String str) {
		int sum = 0;
		String vowels = "aeiouAEIOU";

		for (int i = 0; i < str.length(); i++) {
			if (vowels.indexOf(str.charAt(i)) != -1) {
				sum++;
			}
		}
		return sum;
	}
}

