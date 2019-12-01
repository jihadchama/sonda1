package br.com.jihad.sonda.teste;

import br.com.jihad.sonda.modelo.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class testaSonda{

        public static void main(String[] args) throws IOException {

            Scanner movementsFile = new Scanner(new File("movements.csv"));

            String planetExtension = movementsFile.nextLine().replaceAll("\\s","");
            String sentPosition =  movementsFile.nextLine().replaceAll("\\s","");
            String motionCommands = movementsFile.nextLine();

            if (planetExtension.length() >= 2) {

                Coordinate planetCoordinate = new Coordinate(Integer.parseInt(planetExtension.substring(0, 1)), Integer.parseInt(planetExtension.substring(1, 2)));

                Planet mars = new Planet(planetCoordinate);

                    Coordinate sondaCoordinate = new Coordinate(Integer.parseInt(sentPosition.substring(0, 1)), Integer.parseInt(sentPosition.substring(1, 2)));

                    Sonda sonda = new Sonda();

                    SondaLauncher sendSonda = new SondaLauncher();

                    sendSonda.launchSonda(sonda, sentPosition, sondaCoordinate, mars);

                    MotionCommands sondaMove = new MotionCommands();

                    sondaMove.command(motionCommands, sonda);

                    sonda.currentPosition();
                }
            }
        }
