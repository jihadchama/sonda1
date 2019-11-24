package br.com.jihad.sonda.modelo;

public class Planet {

    private final Coordenates coordenates;


    public Planet(Coordenates coordenates) {
        this.coordenates = coordenates;
    }

    public int getLimitX() {
        return coordenates.getX();
    }

    public int getLimitY() {
        return coordenates.getY();
    }

    public void planetSize() {
        System.out.println(getLimitX() + " " + getLimitY());
    }
}
