import java.util.Scanner;

public class FaltasTrabalho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int faltas[] = new int[100];

        int qtdeFaltas = 0;
        int diaSemana;
        while ((diaSemana = scan.nextInt()) != -1) {
            faltas[qtdeFaltas] = diaSemana;
            qtdeFaltas++;
        }

        double segunda = 0, terca = 0, quarta = 0,
		quinta = 0, sexta = 0, sabado = 0;
        for (int i = 0; i < qtdeFaltas; i++) {
            switch (faltas[i]) {
				case 2:
					segunda++;
					break;
				case 3:
					terca++;
					break;
				case 4:
					quarta++;
					break;
				case 5:
					quinta++;
					break;
				case 6:
					sexta++;
					break;
				case 7:
					sabado++;
					break;
			}
        }

		double porcentagemSegunda = segunda / qtdeFaltas * 100;
		double porcentagemTerca = terca / qtdeFaltas* 100;
		double porcentagemQuarta = quarta / qtdeFaltas* 100;
		double porcentagemQuinta = quinta / qtdeFaltas* 100;
		double porcentagemSexta = sexta / qtdeFaltas* 100;
		double porcentagemSabado = sabado / qtdeFaltas* 100;

        System.out.printf("%.1f %.1f %.1f %.1f %.1f %.1f", porcentagemSegunda, porcentagemTerca, porcentagemQuarta,
		porcentagemQuinta, porcentagemSexta, porcentagemSabado);

    }

}
