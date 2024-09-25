public class Professor {
	public String titulacao;
	public String nome;
	public int matricula;

    public Professor() {
		this("", "", 0);
	}

    public Professor(String titulacao, String nome, int matricula) {
		this.titulacao = titulacao;
		this.nome = nome;
		this.matricula = matricula;
	}
    
	public String getDescricao() {
		return "Prof. " + titulacao + " " + nome + " - mat " + matricula;
	}
}
