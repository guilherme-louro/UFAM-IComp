package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {

	public static void main(String[] args) {
        Localizavel vetorLocalizaveis [] = new Localizavel[100];

        Celular celular1 = new Celular(55, 92, 11112222);
        Celular celular2 = new Celular(501, 43, 98765432);
        CarroLuxuoso carroLuxuoso1 = new CarroLuxuoso("GUI0906");
        CarroLuxuoso carroLuxuoso2 = new CarroLuxuoso("LOURO0906");

        vetorLocalizaveis[0] = celular1;
        vetorLocalizaveis[1] = celular2;
        vetorLocalizaveis[2] = carroLuxuoso1;
        vetorLocalizaveis[3] = carroLuxuoso2;

        for (Localizavel elemento : vetorLocalizaveis) {
            System.out.println(elemento.getPosicao());
        }
    }
}
