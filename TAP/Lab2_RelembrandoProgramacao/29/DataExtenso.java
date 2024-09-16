import java.util.Scanner;

public class DataExtenso {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		String data = scan.next();

		String dia = data.substring(0, 2);
		String mes = data.substring(2, 4);
		String ano = data.substring(4, 8);

		switch (mes) {
				case "01":
					mes = "janeiro";
					break;
				case "02":
					mes = "fevereiro";
					break;
				case "03":
					mes = "março";
					break;
				case "04":
					mes = "abril";
					break;
				case "05":
					mes = "maio";
					break;
				case "06":
					mes = "junho";
					break;
				case "07":
					mes = "julho";
					break;
				case "08":
					mes = "agosto";
					break;
				case "09":
					mes = "setembro";
					break;
				case "10":
					mes = "outubro";
					break;
				case "11":
					mes = "novembro";
					break;
				case "12":
					mes = "dezembro";
					break;
			}
		System.out.printf("%s de %s de %s", dia, mes, ano);
	}
}
