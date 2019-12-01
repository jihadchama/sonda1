package br.com.jihad.sonda;

import br.com.jihad.sonda.model.Coordinate;
import br.com.jihad.sonda.planet.Planet;
import br.com.jihad.sonda.vehicle.Sonda;

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

                CommandTower commandTower = new CommandTower();

                Sonda sonda = new Sonda();

                commandTower.launch(sonda, sondaCoordinate, sondaConfiguration[2], mars);

                commandTower.movement(sonda, commandsList, mars);

                sonda.currentPosition();
            }
        }
    }
}