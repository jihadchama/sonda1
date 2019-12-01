package br.com.jihad.sonda.modelo;

public class Sonda extends Vehicle {

    private Coordinate coordinate;
    private Directions direction;

    @Override
    public void land(Coordinate coordinate, Directions direction, Planet planet) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    @Override
    public void move() {
        coordinate = new Coordinate(coordinate.getX() + direction.getCoordinate().getX(), coordinate.getY() + direction.getCoordinate().getY());
    }

    @Override
    public void turn(char turningDirection) {
        switch(turningDirection) {
            case 'R':
                direction = direction.getRight();
                break;
            case 'L':
                direction = direction.getLeft();
                break;
        }
    }

    public void currentPosition() {
        System.out.println(coordinate.getX() + " " + coordinate.getY() + " " + direction.name());
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Directions getDirection() {
        return direction;
    }
}