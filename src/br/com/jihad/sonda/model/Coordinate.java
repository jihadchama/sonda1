package br.com.jihad.sonda.model;

public class Coordinate {

    private int x, y;

    public Coordinate(int x, int y) {
            this.x = Math.abs(x);
            this.y = Math.abs(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
