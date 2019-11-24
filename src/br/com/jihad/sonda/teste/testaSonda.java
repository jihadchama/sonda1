package br.com.jihad.sonda.teste;

import br.com.jihad.sonda.modelo.Direction;
import br.com.jihad.sonda.modelo.Planet;
import br.com.jihad.sonda.modelo.Coordenates;
import br.com.jihad.sonda.modelo.Sonda;


public class testaSonda {

    public static void main(String[] args){

        Coordenates coordenatesPlanet = new Coordenates(6, 6);


        Planet mars = new Planet(coordenatesPlanet);

         mars.planetSize();
        // 6 6

        Coordenates coordenatesSonda = new Coordenates(2, 3);

        Sonda sonda1 = new Sonda();

        sonda1.land(coordenatesSonda, Direction.NORTH, mars);

        sonda1.currentPosition();
        // 2 3 NORTH

        sonda1.move();

        sonda1.turn("R");

        sonda1.currentPosition();
        // 2 4 EAST

        sonda1.move();

        sonda1.currentPosition();
        // 3 4 EAST

        sonda1.turn("L");

        sonda1.turn("L");

        sonda1.currentPosition();
        // 3 4 WEST
    }


}
