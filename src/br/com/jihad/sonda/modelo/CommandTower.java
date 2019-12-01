package br.com.jihad.sonda.modelo;

public class CommandTower {

    boolean isPossibleLand(Coordinate coordinate, Planet planet) {
        return (coordinate.getX() <= planet.getLimitX()) && (coordinate.getY() <= planet.getLimitY());
    }

    public void launch(Vehicle vehicle, Coordinate coordinate, char direction, Planet planet) {
        if(isPossibleLand(coordinate, planet)) {
            switch(direction) {
                case 'N':
                    vehicle.land(coordinate, Directions.NORTH, planet);
                    break;
                case 'S':
                    vehicle.land(coordinate, Directions.SOUTH, planet);
                    break;
                case 'W':
                    vehicle.land(coordinate, Directions.WEST, planet);
                    break;
                case 'E':
                    vehicle.land(coordinate, Directions.EAST, planet);
                    break;
                default:
                    System.out.println("Esta não é uma direção válida.");
                    break;
            }
        } else {
            System.out.println("Não é possível pousar na coordenada informada.");
        }
    }

    public void movement(Vehicle vehicle, char[]commandsList) {
        for (char command : commandsList) {
            switch (command) {
                case 'L':
                    vehicle.turn('L');
                    break;
                case 'R':
                    vehicle.turn('R');
                    break;
                case 'M':
                    vehicle.move();
                    break;
                default:
                    System.out.println("Este não é um comando válido.");
            }
        }
    }
}



