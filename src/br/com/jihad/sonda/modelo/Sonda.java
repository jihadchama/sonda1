package br.com.jihad.sonda.modelo;

public class Sonda implements Turn, Move {

    private Position position;
    private Direction direction = Direction.NORTH;

    public Sonda(Position position) {
       this.position = position;
    }

    public void currentPosition() {
            System.out.println(position.getX() + " " + position.getY() + " " + direction.name());
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
                    System.out.println("Esta não é uma direção válida");
                break;
            }
    }
}
