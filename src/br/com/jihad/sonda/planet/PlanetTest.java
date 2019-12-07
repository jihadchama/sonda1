package br.com.jihad.sonda.planet;

import br.com.jihad.sonda.model.Coordinate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PlanetTest {

    @Test
    public void PlanetaComCoordenadasPositivas(){

        Planet planet = new Planet(new Coordinate(3, 2));

        assertEquals(3, planet.getLimitX());
        assertEquals(2, planet.getLimitY());
    }

    @Test
    public void PlanetaComCoordenadasNegativas(){

        Planet planet = new Planet(new Coordinate(-3,-2));

        assertEquals(3, planet.getLimitX());
        assertEquals(2, planet.getLimitY());
    }

}