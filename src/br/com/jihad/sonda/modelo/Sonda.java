package br.com.jihad.sonda.modelo;

public class Sonda implements Turn, Move, Land {

    private Coordenates coordenates;
    private Direction direction;


    private boolean isPossibleLand(Coordenates coordenates, Planet planet) {
        return coordenates.getX() <= planet.getLimitX() && coordenates.getY() <= planet.getLimitY();
    }

    @Override
    public void land(Coordenates coordenates, Direction direction, Planet planet) {

            if(isPossibleLand(coordenates, planet)) {
                this.coordenates = coordenates;
                this.direction = direction;
            }
    }

    @Override
    public void move() {

        coordenates = new Coordenates(coordenates.getX() + direction.getCoordenates().getX(), coordenates.getY() + direction.getCoordenates().getY());

    }


    @Override
    public void turn(String turningDirection) {

            switch(turningDirection) {

                case "R":
                    direction = direction.getRight();
                break;
                case "L":
                    direction = direction.getLeft();
                break;
                default:
                    System.out.println("Esta não é uma direção válida.");
                break;
            }
    }

    public void currentPosition() {

        System.out.println(coordenates.getX() + " " + coordenates.getY() + " " + direction.name());
    }

}
