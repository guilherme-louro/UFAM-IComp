import java.util.Scanner;

public class HorasTrabalho {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int matrizHorasTrabalho [][] = new int [100][100];
		int diaSemana = 0;
        int funcionario = 0;
		int horasDia;
        while ((horasDia = scan.nextInt()) != -1) {
            matrizHorasTrabalho[funcionario][diaSemana] = horasDia;
            diaSemana++;
			if (diaSemana == 7) {
				diaSemana = 0;
				funcionario++;
			}
        }

		for (int i = 0; i < funcionario; i++) {
			int horasSemana = 0;
			for (int j = 0; j < 7; j++) {
				horasSemana += matrizHorasTrabalho[i][j];
			}
			System.out.printf("%d \n", horasSemana);
		}
	}
}
