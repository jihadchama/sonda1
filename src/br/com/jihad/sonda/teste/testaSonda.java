package br.com.jihad.sonda.teste;

import br.com.jihad.sonda.modelo.Directions;
import br.com.jihad.sonda.modelo.Planet;
import br.com.jihad.sonda.modelo.Coordinate;
import br.com.jihad.sonda.modelo.Sonda;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class testaSonda{

        public static void main(String[] args) throws IOException {

            Scanner movementsSonda = new Scanner(new File("movements.csv"));

            String discoverPlanet = movementsSonda.nextLine().replaceAll("\\s","");
            String sendSonda =  movementsSonda.nextLine().replaceAll("\\s","");
            String commandsMovements = movementsSonda.nextLine();

            Coordinate planetCoordinate = new Coordinate(Integer.parseInt(String.valueOf(discoverPlanet.charAt(0))), Integer.parseInt(String.valueOf(discoverPlanet.charAt(1))));
            Planet mars = new Planet(planetCoordinate);

            Coordinate sondaCoordinate = new Coordinate(Integer.parseInt(String.valueOf(sendSonda.charAt(0))), Integer.parseInt(String.valueOf(sendSonda.charAt(1))));

            Sonda sonda = new Sonda();

            Directions sondaDirection = Directions.EAST; //encontrar uma forma de não ter que iniciar uma direção.

            switch(sendSonda.charAt(2)){
                case 'N':
                    sondaDirection = Directions.NORTH;
                    break;
                case 'S':
                    sondaDirection = Directions.SOUTH;
                    break;
                case 'W':
                    sondaDirection = Directions.WEST;
                    break;
                case 'E':
                    sondaDirection = Directions.EAST;
                    break;
                default:
                    System.out.println("Esta não é uma direção válida.");
                    break;
            }

            sonda.land(sondaCoordinate, sondaDirection, mars);

            char[] commandList = commandsMovements.toCharArray();

            for (char command : commandList) {

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