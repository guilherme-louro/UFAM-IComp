package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {
	public double largura;
	public double altura;
	
	public Retangulo(int posX, int posY, double largura, double altura){
		super(posX, posY);
		this.largura = largura;
		this.altura = altura;
	}
	
	public double getArea(){
		return largura * altura;
	}

    public double getPerimetro(){
        return 2*largura + 2*altura;
	}
	
	public String toString(){
		StringBuilder descricao = new StringBuilder();
		descricao.append(String.format("Retângulo na posição (%d, %d) com largura de %.1fcm e altura de %.1fcm (área=%.1fcm2, perímetro=%.1fcm)", posX, posY, largura, altura, getArea(), getPerimetro()));
		return descricao.toString();
	}
}