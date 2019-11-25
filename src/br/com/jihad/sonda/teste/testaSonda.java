package br.com.jihad.sonda.teste;

import br.com.jihad.sonda.modelo.Directions;
import br.com.jihad.sonda.modelo.Planet;
import br.com.jihad.sonda.modelo.Coordinate;
import br.com.jihad.sonda.modelo.Sonda;

import java.io.FileNotFoundException;


public class testaSonda {

    public static void main(String[] args) throws FileNotFoundException {


        String criaPlaneta = "5 5";
        String criaPlaneta2 = criaPlaneta.replaceAll("\\s","");
        String criaSonda = "1 2 N";
        String criaSonda2 = criaSonda.replaceAll("\\s","");
        String criaMovimentos = "LMLMLMLMM";


        Coordinate planetCoordinate = new Coordinate(Integer.parseInt(String.valueOf(criaPlaneta2.charAt(0))), Integer.parseInt(String.valueOf(criaPlaneta2.charAt(1))));
        Planet mars = new Planet(planetCoordinate);

        Coordinate sondaCoordinate = new Coordinate(Integer.parseInt(String.valueOf(criaSonda2.charAt(0))), Integer.parseInt(String.valueOf(criaSonda2.charAt(1))));

        Sonda sonda1 = new Sonda();

        Directions sondaDirection = Directions.EAST;

        switch(criaSonda2.charAt(2)){
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

        sonda1.land(sondaCoordinate, sondaDirection, mars);

        char[] b = criaMovimentos.toCharArray();

        for (char c : b) {

            switch (c) {
                case 'L':
                    sonda1.turn('L');
                    break;
                case 'R':
                    sonda1.turn('R');
                    break;
                case 'M':
                    sonda1.move();
                    break;
                default:
                    System.out.println("Este não é um comando válido");
            }

        }

        sonda1.currentPosition();

    }
}