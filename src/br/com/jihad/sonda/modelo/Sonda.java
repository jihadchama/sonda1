package br.com.jihad.sonda.modelo;

public class Sonda implements Turn, Move, Land {

    private Position position;
    private Direction direction;

    @Override
    public void land(int x, int y, Direction direction, Planet planet) {

        if(x <= planet.getLimitX() && y <= planet.getLimitY()){
            this.position = new Position(x, y);
            this.direction = direction;
        } else {
            System.out.println("A nave não pode pousar fora do planeta.");
        }
    }

    @Override
    public void move() {

    position = new Position (position.getX() + direction.getX(), position.getY() + direction.getY());
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

        System.out.println(position.getX() + " " + position.getY() + " " + direction.name());
    }

}
