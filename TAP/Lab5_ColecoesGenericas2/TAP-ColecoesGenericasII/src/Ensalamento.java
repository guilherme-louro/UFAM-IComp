import java.util.ArrayList;
import java.util.Comparator;


public class Ensalamento {
	public ArrayList<Sala> salas = new ArrayList<>();
    public ArrayList<Turma> turmas = new ArrayList<>();
    public ArrayList<TurmaEmSala> ensalamento = new ArrayList<>();

	public Ensalamento(){
	}

	void addSala(Sala sala){
		salas.add(sala);
	}

	void addTurma(Turma turma){
		turmas.add(turma);
	}

	Sala getSala(Turma turma){
		for (TurmaEmSala turmaEmSalaAtual: ensalamento) {
			if(turmaEmSalaAtual.turma == turma){
				return turmaEmSalaAtual.sala;
			}
		}	
		return null; 
	}

	boolean salaDisponivel(Sala sala, int horario){
		for (TurmaEmSala salaProcurada: ensalamento) {
			if(salaProcurada.sala.equals(sala)){
				for (int hora: salaProcurada.turma.horarios) {
					if(hora == horario){
						return false;
					}
				}
			}	
		}
		return true;
	}
	
	boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios){
		for (int hora : horarios) {
			if (salaDisponivel(sala, hora) == false){
				return false;
			}
		}
		return true;
	}

	boolean alocar(Turma turmaParaAlocar, Sala salaParaAlocar){
		// Uma turma acessivel só pode ser alocada em uma sala também acessivel.
		if (turmaParaAlocar.acessivel == true && salaParaAlocar.acessivel == false) {
			return false;
		}
		// A quantidade de alunos na turma deve ser igual ou menor à capacidade da sala.
		if (turmaParaAlocar.numAlunos > salaParaAlocar.capacidade) {
			return false;
		}
		// A sala precisa estar disponível em todos os horários da turma.
		if (salaDisponivel(salaParaAlocar, turmaParaAlocar.horarios) == false) {
			return false;
		}
		TurmaEmSala turmaCriada = new TurmaEmSala(turmaParaAlocar, salaParaAlocar); // só se passar no if
		ensalamento.add(turmaCriada);
		return true;
	}

	void alocarTodas(){
		// // SALAS
		// ArrayList<Sala> salasNaoAcessiveis = new ArrayList<>();
		// // separar entre acessiveis e nao-acessiveis
		// for (Sala sala : salas) {
		// 	if (sala.acessivel) {salasAcessiveis.add(sala);}
		// 	else {salasNaoAcessiveis.add(sala);}
		// }
		// // separar entre turmas acessiveis e nao-acessiveis
		// // salasAcessiveis.sort(Comparator.comparingInt(sala -> sala.capacidade));
		// // salasAcessiveis.reversed();
		// // salasNaoAcessiveis.sort(Comparator.comparingInt(sala -> sala.capacidade));
		// // salasNaoAcessiveis.reversed();
		// for (Sala salaAtual : salas) {
		// 	if (salaAtual.acessivel) {salasAcessiveis.add(salaAtual);}
		// 	else {salasNaoAcessiveis.add(salaAtual);}
		// }

		// // TURMAS
		// ArrayList<Turma> turmasAcessiveis = new ArrayList<>();
		// ArrayList<Turma> turmasNaoAcessiveis = new ArrayList<>();
		// // separar entre acessiveis e nao-acessiveis
		// for (Turma turma : turmas) {
		// 	if (turma.acessivel) {turmasAcessiveis.add(turma);}
		// 	else {turmasNaoAcessiveis.add(turma);}
		// }
		// // ordenar em ordem decrescente esses dois arrays
		// // turmasAcessiveis.sort(Comparator.comparingInt(turma -> turma.numAlunos));
		// // turmasAcessiveis.reversed();
		// // turmasNaoAcessiveis.sort(Comparator.comparingInt(turma -> turma.numAlunos));
		// // turmasNaoAcessiveis.reversed();

		// // ALOCAÇÃO
		// // sala acessível para turmas acessíveis
		// for (Turma turmaAcessivelAtual : turmasAcessiveis) {
		// 	for (Sala salaAcessivelAtual : salasAcessiveis) {
		// 		if (alocar(turmaAcessivelAtual, salaAcessivelAtual)) {
		// 			// turmasAcessiveis.remove(turmaAcessivelAtual);
		// 			break;
		// 		}
		// 	}
		// }

		// // juntar as turmas e as salas
		// ArrayList<Turma> turmasRestantes = new ArrayList<>();
		// turmasRestantes.addAll(turmasNaoAcessiveis);
		// turmasRestantes.addAll(turmasAcessiveis);
		// // turmasRestantes.sort(Comparator.comparingInt(turma -> turma.numAlunos));
		// // turmasRestantes.reversed();

		// ArrayList<Sala> salasRestantes = new ArrayList<>();
		// salasRestantes.addAll(salasNaoAcessiveis);
		// salasRestantes.addAll(salasAcessiveis);
		// // salasRestantes.sort(Comparator.comparingInt(sala -> sala.capacidade));
		// // salasRestantes.reversed();

		// // qualquer sala para o resto das turmas
		// for (Turma turmaAtual : turmasRestantes) {
		// 	for (Sala salaAtual : salasRestantes) {
		// 		if (alocar(turmaAtual, salaAtual)) {
		// 			// turmasAcessiveis.remove(turmaAtual);
		// 			break;
		// 		}
		// 	}
		// }
		
		salas.sort(Comparator.comparingInt(sala -> sala.capacidade));

		for (Turma turmaAtual : turmas) {
			if (turmaAtual.acessivel) {
				for (Sala salaAtual : salas) {
					if (alocar(turmaAtual, salaAtual)) {
						break;
					}
				}
			}
		}
		for (Turma turmaAtual : turmas) {
			if (getSala(turmaAtual) == null) {
				for (Sala salaAtual : salas) {
					if (alocar(turmaAtual, salaAtual)) {
						break;
					}
				}
			}
		}
	}

    int getTotalTurmasAlocadas(){
		int contadorSalas = 0;
		for (TurmaEmSala turmaEmSalaAtual: ensalamento) {
			if (turmaEmSalaAtual.sala != null){
				contadorSalas++;
			}
		}
		return contadorSalas;
	}

	int getTotalEspacoLivre(){
		int total = 0;
		for (TurmaEmSala turmaEmSalaAtual: ensalamento) {
			total += turmaEmSalaAtual.sala.capacidade - turmaEmSalaAtual.turma.numAlunos;		
		}
		return total;
	}

	int getTotalSalas(){
		// int contadorSalas = 0;
		// for (Sala salaAtual: salas) {
		// 	contadorSalas++;
		// }
		// return contadorSalas;
		return salas.size();
	}

	int getTotalTurmas(){
		// int contadorTurmas = 0;
		// for (Turma turmaAtual: turmas) {
		// 	contadorTurmas++;
		// }
		// return contadorTurmas;
		return turmas.size();
	}

	String relatorioResumoEnsalamento(){
		StringBuilder descricao = new StringBuilder();
		descricao.append(String.format("Total de Salas: %d\n", getTotalSalas()));
        descricao.append(String.format("Total de Turmas: %d\n", getTotalTurmas()));
        descricao.append(String.format("Turmas Alocadas: %d\n", getTotalTurmasAlocadas()));
        descricao.append(String.format("Espaços Livres: %d\n", getTotalEspacoLivre()));
		descricao.append("\n");
		return descricao.toString();
	} 

	String relatorioTurmasPorSala(){
		StringBuilder descricao = new StringBuilder();
		descricao.append(relatorioResumoEnsalamento());
		for (Sala salaAtual : salas) {
			descricao.append(String.format("--- %s --- \n", salaAtual.getDescricao()));
			descricao.append("\n");

			for (TurmaEmSala turmaEmSalaAtual : ensalamento){
					if (getSala(turmaEmSalaAtual.turma) == salaAtual){
					descricao.append(String.format("%s \n\n", turmaEmSalaAtual.turma.getDescricao()));
				}
			}
		}
		return descricao.toString();
	}

	String relatorioSalasPorTurma(){
		StringBuilder descricao = new StringBuilder();
		descricao.append(String.format("%s",relatorioResumoEnsalamento()));
		for (Turma turmaAtual : turmas){
			descricao.append(String.format("%s", turmaAtual.getDescricao()));
			if (getSala(turmaAtual) != null){
				descricao.append(String.format("Sala: %s\n", getSala(turmaAtual).getDescricao()));
			}
			else{
				descricao.append("Sala: SEM SALA\n");
			}
		}
		return descricao.toString();
	} 
}