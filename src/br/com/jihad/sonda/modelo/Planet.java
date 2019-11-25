package br.com.jihad.sonda.modelo;

public class Planet {

    private final Coordinate coordinate;


    public Planet(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public int getLimitX() {
        return coordinate.getX();
    }

    public int getLimitY() {
        return coordinate.getY();
    }

    public void planetSize() {
        System.out.println(getLimitX() + " " + getLimitY());
    }
}
