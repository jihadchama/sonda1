package br.com.jihad.sonda.modelo;

public class CommandTower {

    public void launch(Vehicle vehicle, Coordinate coordinate, Directions direction, Planet planet) {
        vehicle.land(coordinate, direction, planet);
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



