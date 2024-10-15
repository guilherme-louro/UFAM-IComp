package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.Random;

public class CarroLuxuoso extends Carro implements Localizavel{

	public CarroLuxuoso(String placa){
		super(placa);
	}
	public Posicao getPosicao(){
		Random r = new Random();
		double latitude = -3.160000 + (-2.960000 - (-3.160000)) * r.nextDouble();
		double longitude = -60.120000 + (-59.820000 - (-60.120000)) * r.nextDouble();
		double altitude = 15 + (100 - 15) * r.nextDouble();
		Posicao posicaoAtual = new Posicao(latitude, longitude, altitude);
		return posicaoAtual;
	}

	public double getErroLocalizacao(){
		return 15.0;
	}
}