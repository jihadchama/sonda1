package br.com.jihad.sonda.modelo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("movements.csv"));

        char[] planetConfiguration = scanner.nextLine().replaceAll("\\s", "").toCharArray();
        char[] sondaConfiguration = scanner.nextLine().replaceAll("\\s", "").toCharArray();
        char[] commandsList = scanner.nextLine().toCharArray();

        if (planetConfiguration.length == 2 ) {
            Coordinate planetCoordinate = new Coordinate(Character.getNumericValue(planetConfiguration[0]), Character.getNumericValue(planetConfiguration[1]));
            Planet mars = new Planet(planetCoordinate);

            if (sondaConfiguration.length == 3) {
                Coordinate sondaCoordinate = new Coordinate(Character.getNumericValue(sondaConfiguration[0]), Character.getNumericValue(sondaConfiguration[1]));

                Sonda sonda = new Sonda();
                switch(sondaConfiguration[2]){
                    case 'N':
                        sonda.land(sondaCoordinate, Directions.NORTH, mars);
                        break;
                    case 'S':
                        sonda.land(sondaCoordinate, Directions.SOUTH, mars);
                        break;
                    case 'W':
                        sonda.land(sondaCoordinate, Directions.WEST, mars);
                        break;
                    case 'E':
                        sonda.land(sondaCoordinate, Directions.EAST, mars);
                        break;
                    default:
                        System.out.println("Esta não é uma direção válida.");
                        break;
                }

                for (char command : commandsList) {
                    switch (command) {
                        case 'L':
                            sonda.turn('L');
                            break;
                        case 'R':
                            sonda.turn('R');
                            break;
                        case 'M':
                            sonda.move();
                            break;
                        default:
                            System.out.println("Este não é um comando válido.");
                    }
                }
                sonda.currentPosition();
            }
        }
    }
}