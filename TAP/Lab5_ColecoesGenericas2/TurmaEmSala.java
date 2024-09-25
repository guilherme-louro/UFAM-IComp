public class Mestre {
	public String nome;
	public int anoNascimento;
	public String afiliacao;
	public String posto;

	public Mestre() {
		this("", 0, "", "");
	}

	public Mestre(String nome, int anoNascimento, String afiliacao, String posto) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.afiliacao = afiliacao; 
		this.posto = posto;
	}

	public int getIdade(int anoAtual) {
		int idade = anoAtual - anoNascimento;
		return idade;
	}

	public boolean possuiForca() {
		return "Jedi".equals(posto) || "Sith".equals(posto);
	}

	public String getAnoNascimentoString() {
		if (anoNascimento < 0) {
            return Math.abs(anoNascimento) + "ABY"; 
        } else {
            return anoNascimento + "DBY"; 
        }
	}

	public String getDescricao() {
		return "Mestre: nome=" + nome +
                ", anoNascimento=" + getAnoNascimentoString() +
                ", afiliacao=" + afiliacao +
                ", posto=" + posto +
                ", possuiForca=" + possuiForca() + "."
				;
	}
}
