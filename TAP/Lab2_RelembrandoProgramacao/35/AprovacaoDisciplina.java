import java.util.Scanner;

public class AprovacaoDisciplina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double notas[] = new double[100];
        int horas[] = new int[100];

        int aluno = 0;
        double nota;
        while ((nota = scan.nextDouble()) != -1) {
            notas[aluno] = nota;
            aluno++;
        }

        aluno = 0;
		int hora;
        while ((hora = scan.nextInt()) != -1) {
            horas[aluno] = hora;
            aluno++;
        }

		int cargaHora = scan.nextInt();
		int cargaHoraMninma = (int) (0.75 * cargaHora);

        int aprovado = 0, reprovadoNota = 0, reprovadoFrequencia = 0;
        for (int i = 0; i < aluno; i++) {
			if (horas[i] < cargaHoraMninma){
				reprovadoFrequencia++;
			}
			else {
				if (notas[i] >= 5.0){
					aprovado++;
				}
				else {
					reprovadoNota++;
				}
			}
        }

        System.out.printf("%d %d %d", aprovado, reprovadoNota, reprovadoFrequencia);

    }

}
