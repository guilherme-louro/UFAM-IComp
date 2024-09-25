import java.util.ArrayList;

public class Turma {
	public String disciplina;
    public int ano;
    public int semestre;
	public Professor professor;
	public ArrayList<Aluno> alunos;

    public Turma(String disciplina, int ano, int semestre, Professor professor) {
		this.disciplina = disciplina;
		this.ano = ano;
		this.semestre = semestre;
		this.professor = professor;
		this.alunos = new ArrayList<>();
	}

    public void addAluno(Aluno aluno) {
		if (getAluno(aluno.matricula) == null) {
			alunos.add(aluno);
		}
	}

	public Aluno getAluno(int matricula) {
		Aluno alunoProcurado = null;
		
		for (Aluno aluno : alunos) {
			if (aluno.matricula == matricula){
				alunoProcurado = aluno;
				return alunoProcurado;
			}
		}
		return alunoProcurado;
	}

	public double getMediaIdade() {
		double mediaIDadeTurma;
		int somaIdadeTurma = 0;
		double alunosTurma = 0;
		for (Aluno aluno: alunos) {
			somaIdadeTurma+=aluno.getIdade();
			alunosTurma++;
		}
		mediaIDadeTurma = somaIdadeTurma / alunosTurma;
		return mediaIDadeTurma;
	}
    
	public String getDescricao() {
		StringBuilder descricao = new StringBuilder();
		descricao.append(String.format("Turma %s - %d/%d (%s):\n", disciplina, ano, semestre, professor.getDescricao()));
		int contador = 1;
		for (Aluno aluno : alunos) {
			descricao.append(String.format(" - Aluno %d: %s\n", contador, aluno.getDescricao()));
			contador++;
		}
		return descricao.toString();
	}
}
