package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
    private int posX;
    private int posY;
    private int digito;

    public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException{
        if (posX < 0) throw new CoordenadaNegativaException();
        if (posX < 0 || posX > 30000) throw new CoordenadaForaDosLimitesException();
        this.posX = posX;
        if (posY < 0) throw new CoordenadaNegativaException();
        if (posY < 0 || posY > 30000) throw new CoordenadaForaDosLimitesException();
        this.posY = posY;
        if (digito < 0 || digito > 9) throw new DigitoInvalidoException();
        if ((posX+posY)%10 != digito) throw new DigitoInvalidoException();
        this.digito = digito;
    }

    public int getPosX(){
        return posX;
    }

    public int getPosY(){
        return posY;
    }

    public double distancia(Coordenada coordenada){
        double dAB_squared = Math.pow(coordenada.posX - posX, 2) + Math.pow(coordenada.posY - posY, 2);
        return Math.sqrt(dAB_squared);
    }

    public String toString(){
        return getPosX() + ", " + getPosY(); 
    }
}