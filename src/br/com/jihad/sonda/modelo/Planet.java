package br.com.jihad.sonda.modelo;

public class Planet {

    //static int limitX;
    private final int limitX;
    //static int limitY;
    private final int limitY;


    public Planet(int x, int y) {
        this.limitX = x;
        this.limitY = y;
    }

    public int getLimitX() {
        return limitX;
    }

    public int getLimitY() {
        return limitY;
    }

    public void planetSize() {
        System.out.println(limitX + " " + limitY);
    }
}
