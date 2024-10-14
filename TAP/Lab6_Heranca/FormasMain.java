package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {

	public static void main(String[] args) {
        FormaGeometrica formas [] = new FormaGeometrica[100];

        Circulo circulo1 = new Circulo(0, 0, 1);
        Circulo circulo2 = new Circulo(0, 0, 2);
        Retangulo retangulo1 = new Retangulo(0, 0, 3, 4);
        Retangulo retangulo2 = new Retangulo(0, 0, 5, 6);
        Quadrado quadrado1 = new Quadrado(0, 0, 7);
        Quadrado quadrado2 = new Quadrado(0, 0, 8);

        formas[0] = circulo1;
        formas[1] = circulo2;
        formas[2] = retangulo1;
        formas[3] = retangulo2;
        formas[4] = quadrado1;
        formas[5] = quadrado2;

        for (FormaGeometrica forma : formas) {
            System.out.println(forma);
        }
    }
}
