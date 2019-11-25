package br.com.jihad.sonda.modelo;

public class Sonda implements Turn, Move, Land {

    private Coordinate coordinate;
    private Directions directions;


    private boolean isPossibleLand(Coordinate coordinate, Planet planet) {
        return coordinate.getX() <= planet.getLimitX() && coordinate.getY() <= planet.getLimitY();
    }

    @Override
    public void land(Coordinate coordinate, Directions directions, Planet planet) {

            if(isPossibleLand(coordinate, planet)) {
                this.coordinate = coordinate;
                this.directions = directions;
            }
    }

    @Override
    public void move() {

        coordinate = new Coordinate(coordinate.getX() + directions.getCoordinate().getX(), coordinate.getY() + directions.getCoordinate().getY());

    }


    @Override
    public void turn(char turningDirection) {

            switch(turningDirection) {

                case 'R':
                    directions = directions.getRight();
                break;
                case 'L':
                    directions = directions.getLeft();
                break;
                default:
                    System.out.println("Esta não é uma direção válida.");
                break;
            }
    }

    public void currentPosition() {

        System.out.println(coordinate.getX() + " " + coordinate.getY() + " " + directions.name());
    }

}
