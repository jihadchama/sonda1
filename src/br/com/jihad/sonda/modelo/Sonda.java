package br.com.jihad.sonda.modelo;

public class Sonda implements Turn, Move, Land{

    private Coordinate coordinate;
    private Directions direction;

    private boolean isPossibleLand(Coordinate coordinate, Planet planet) {
        return (coordinate.getX() <= planet.getLimitX()) && (coordinate.getY() <= planet.getLimitY());
    }

    @Override
    public void land(Coordinate coordinate, Directions direction, Planet planet) {
        if(isPossibleLand(coordinate, planet)) {
            this.coordinate = coordinate;
            this.direction = direction;
        } else {
            System.out.println("Não é possível pousar a sonda na coordenada informada");
        }
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
}