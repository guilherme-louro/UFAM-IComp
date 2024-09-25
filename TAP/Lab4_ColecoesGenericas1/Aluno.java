import java.util.Calendar;

public class Aluno {
	public String nome;
	public int matricula;
	public int anoNascimento;

    public Aluno() {
		this("", 0, 0);
	}

    public Aluno(String nome, int matricula, int anoNascimento) {
		this.nome = nome;
		this.matricula = matricula;
		this.anoNascimento = anoNascimento;
	}


    public int getIdade() {
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		int idade = ano - anoNascimento;
		return idade;
	}
    
	public String getDescricao() {
		return nome + " (mat=" + matricula + ", idade=" + getIdade() + ")";
	}
}
