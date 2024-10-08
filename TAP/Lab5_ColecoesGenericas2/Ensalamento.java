import java.util.ArrayList;

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
		ArrayList<Turma> turmasOrdenadas = new ArrayList<>(turmas);
        ArrayList<Sala> salasOrdenadas = new ArrayList<>(salas);

        turmasOrdenadas.sort((t1, t2) -> Integer.compare(t2.numAlunos, t1.numAlunos));
        salasOrdenadas.sort((s1, s2) -> Integer.compare(s1.capacidade, s2.capacidade));

		for (Turma turmaAtual : turmasOrdenadas) {
			if (turmaAtual.acessivel) {
				for (Sala salaAtual : salasOrdenadas) {
					if (alocar(turmaAtual, salaAtual)) {
						break;
					}
				}
			}
		}
		for (Turma turmaAtual : turmasOrdenadas) {
			if (getSala(turmaAtual) == null) {
				for (Sala salaAtual : salasOrdenadas) {
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
		return salas.size();
	}

	int getTotalTurmas(){
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