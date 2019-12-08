package br.com.jihad.sonda;

import br.com.jihad.sonda.model.Coordinate;
import br.com.jihad.sonda.model.Directions;
import br.com.jihad.sonda.planet.Planet;
import br.com.jihad.sonda.vehicle.Sonda;
import br.com.jihad.sonda.vehicle.Vehicle;

class CommandTower {

    boolean isPossibleLand(Vehicle vehicle, Coordinate coordinate, Planet planet) {
        if (vehicle instanceof Sonda) {
           return (coordinate.getX() <= planet.getLimitX() && coordinate.getY() <= planet.getLimitY());
        }
        return false;
    }

    void launch(Vehicle vehicle, Coordinate coordinate, char direction, Planet planet) {
        if(isPossibleLand(vehicle, coordinate, planet)) {
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

    boolean isPossibleMove(Vehicle vehicle, Planet planet) {
        if (vehicle instanceof Sonda) {
            Sonda sonda = (Sonda) vehicle;
            Coordinate coordinate = sonda.getCoordinate();
            Directions directions = sonda.getDirection();
            Coordinate newCoordinate = new Coordinate(coordinate.getX() + directions.getCoordinate().getX(), coordinate.getY() + directions.getCoordinate().getY());

            return (newCoordinate.getX() <= planet.getLimitX() && newCoordinate.getX() >= 0 && newCoordinate.getY() <= planet.getLimitY() && newCoordinate.getY() >= 0);
        }
        return false;
    }

    void movement(Vehicle vehicle, char[] commandsList, Planet planet) {
        if (isPossibleMove(vehicle, planet)){
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
}