package br.edu.icomp.ufam.lab_heranca;
public abstract class FormaGeometrica {

    public int posX;
    public int posY;

    public FormaGeometrica(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public abstract double getArea();

    public abstract double getPerimetro();

    public String getPosString() {
        StringBuilder posString = new StringBuilder();
        posString.append(String.format("posição (%d, %d)", posX, posY));
        return posString.toString();
    }
}
