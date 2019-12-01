package br.com.jihad.sonda.planet;

import br.com.jihad.sonda.model.Coordinate;

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
}