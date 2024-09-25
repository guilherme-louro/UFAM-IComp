public class Sala {
	public int bloco;
	public int sala;
	public int capacidade;
	public boolean acessivel;

	public Sala(){
		this(0,0,0, false);
	}

	public Sala(int bloco, int sala, int capacidade, boolean acessivel){
		this.bloco = bloco;
		this.sala = sala;
		this.capacidade = capacidade;
		this.acessivel = acessivel; 
	}

	public String stringAcessivel(){
		if (acessivel == true){
			return "acessível";
		}
		else{
			return "não acessível";
		}
	}

	public String getDescricao(){
		StringBuilder descricao = new StringBuilder();
		descricao.append(String.format("Bloco %d, Sala %d (%d lugares, %s)", bloco, sala, capacidade, stringAcessivel()));
		return descricao.toString();
	}
}

