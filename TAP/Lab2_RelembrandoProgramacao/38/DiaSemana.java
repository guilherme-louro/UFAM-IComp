import java.util.Scanner;

public class DiaSemana {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int matrizHorasTrabalho[][] = new int[100][100];
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

		int totalHorasPorDia[] = new int[8];
		totalHorasPorDia[0] = -1;

        for (int j = 0; j < 7; j++) {
            int somaHorasDia = 0;
            for (int i = 0; i < funcionario; i++) {
                somaHorasDia += matrizHorasTrabalho[i][j];
            }
			switch (j+1) {
				case 1: // domingo
					totalHorasPorDia[1] = somaHorasDia;
					break;
				case 2: // segunda
					totalHorasPorDia[2] = somaHorasDia;
					break;
				case 3: // terça
					totalHorasPorDia[3] = somaHorasDia;
					break;
				case 4: // quarta
					totalHorasPorDia[4] = somaHorasDia;
					break;
				case 5: // quinta
					totalHorasPorDia[5] = somaHorasDia;
					break;
				case 6: // sexta
					totalHorasPorDia[6] = somaHorasDia;
					break;
				case 7: // sábado
					totalHorasPorDia[7] = somaHorasDia;
					break;
        	}
    	}

		int maxHoras = 0;
        for (int horas : totalHorasPorDia) {
            if (horas > maxHoras) {
                maxHoras = horas;
            }
        }
        
        for (int i = 1; i < 8; i++) {
            if (totalHorasPorDia[i] == maxHoras) {
                System.out.println(i);
            }
        }
	}
}
