package br.com.jihad.sonda.modelo;

class CommandTower {

    private boolean isPossibleLand(Coordinate coordinate, Planet planet) {
        return (coordinate.getX() <= planet.getLimitX()) && (coordinate.getY() <= planet.getLimitY());
    }

    void launch(Vehicle vehicle, Coordinate coordinate, char direction, Planet planet) {
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

    private boolean isPossibleMove(Vehicle vehicle, Planet planet) {

        if (vehicle instanceof Sonda) {
            Sonda sonda = (Sonda) vehicle;
            Coordinate coordinate = sonda.getCoordinate();
            Directions directions = sonda.getDirection();
            Coordinate newCordinate = new Coordinate(coordinate.getX() + directions.getCoordinate().getX(), coordinate.getY() + directions.getCoordinate().getY());

            if( newCordinate.getX() < planet.getLimitX() || newCordinate.getX() > 0 || newCordinate.getY() < planet.getLimitY() || newCordinate.getY() > 0) {
                return true;
            }

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



