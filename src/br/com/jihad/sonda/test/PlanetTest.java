package br.com.jihad.sonda.test;

import br.com.jihad.sonda.model.Coordinate;
import br.com.jihad.sonda.planet.Planet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    void planetWithPositiveCoordinates() {

        Planet planet = new Planet(new Coordinate(6, 6));

        assertEquals(6, planet.getLimitX());
        assertEquals(6, planet.getLimitY());
    }

    @Test
    void planetWithNegativeCoordinates() {

        Planet planet = new Planet(new Coordinate(-6,-6));

        assertEquals(6, planet.getLimitX());
        assertEquals(6, planet.getLimitY());
    }

    @Test
    public void planetWithNegativeXCoordinate() {

        Planet planet = new Planet(new Coordinate(-6,6));

        assertEquals(6, planet.getLimitX());
        assertEquals(6, planet.getLimitY());
    }

    @Test
    void planetWithNegativeYCoordinate() {

        Planet planet = new Planet(new Coordinate(6,-6));

        assertEquals(6, planet.getLimitX());
        assertEquals(6, planet.getLimitY());
    }
}