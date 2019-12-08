package br.com.jihad.sonda.test;

import br.com.jihad.sonda.model.Coordinate;
import br.com.jihad.sonda.model.Directions;
import br.com.jihad.sonda.planet.Planet;
import br.com.jihad.sonda.vehicle.Sonda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SondaTest {

    private Sonda sonda;
    private Planet planet;
    private Coordinate sondaCoordinate;

    @BeforeEach
    void createSonda(){

        Coordinate coordinate = new Coordinate(6,6);
        this.planet = new Planet(coordinate);
        this.sonda = new Sonda();
        this.sondaCoordinate = new Coordinate(1,2);
    }

    @Test
    void shouldLandTheSonda() {

        sonda.land(sondaCoordinate, Directions.NORTH, planet);

        assertEquals(1, sonda.getCoordinate().getX());
        assertEquals(2, sonda.getCoordinate().getY());
    }

    @Test
    void shouldMoveTheSonda() {

        sonda.land(sondaCoordinate, Directions.NORTH, planet);

        sonda.move();

        assertEquals(1, sonda.getCoordinate().getX());
        assertEquals(3, sonda.getCoordinate().getY());
    }

    @Test
    void ShouldTurnTheSondaToRightFromNorth() {

        sonda.land(sondaCoordinate, Directions.NORTH, planet);

        sonda.turn('R');

        assertEquals(Directions.EAST, sonda.getDirection());
    }

    @Test
    void ShouldTurnTheSondaToRightFromEast() {

        sonda.land(sondaCoordinate, Directions.EAST, planet);

        sonda.turn('R');

        assertEquals(Directions.SOUTH, sonda.getDirection());
    }

    @Test
    void ShouldTurnTheSondaToRightFromSouth() {

        sonda.land(sondaCoordinate, Directions.SOUTH, planet);

        sonda.turn('R');

        assertEquals(Directions.WEST, sonda.getDirection());
    }

    @Test
    void ShouldTurnTheSondaToRightFromWest() {

        sonda.land(sondaCoordinate, Directions.WEST, planet);

        sonda.turn('R');

        assertEquals(Directions.NORTH, sonda.getDirection());
    }

    @Test
    void ShouldTurnTheSondaToLeftFromNorth() {

        sonda.land(sondaCoordinate, Directions.NORTH, planet);

        sonda.turn('L');

        assertEquals(Directions.WEST, sonda.getDirection());
    }

    @Test
    void ShouldTurnTheSondaToLeftFromWest() {

        sonda.land(sondaCoordinate, Directions.WEST, planet);

        sonda.turn('L');

        assertEquals(Directions.SOUTH, sonda.getDirection());
    }

    @Test
    void ShouldTurnTheSondaToLeftFromSouth() {

        sonda.land(sondaCoordinate, Directions.SOUTH, planet);

        sonda.turn('L');

        assertEquals(Directions.EAST, sonda.getDirection());
    }

    @Test
    void ShouldTurnTheSondaToLeftFromEAST() {

        sonda.land(sondaCoordinate, Directions.EAST, planet);

        sonda.turn('L');

        assertEquals(Directions.NORTH, sonda.getDirection());
    }
}