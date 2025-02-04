package br.com.jihad.sonda.test;

import br.com.jihad.sonda.CommandTower;
import br.com.jihad.sonda.model.Coordinate;
import br.com.jihad.sonda.model.Directions;
import br.com.jihad.sonda.planet.Planet;
import br.com.jihad.sonda.vehicle.Sonda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandTowerTest {

    private Sonda sonda;
    private Planet planet;
    private CommandTower commandTower;

    @BeforeEach
    void createSonda() {

        Coordinate coordinate = new Coordinate(6, 6);
        this.planet = new Planet(coordinate);
        this.sonda = new Sonda();
        this.commandTower = new CommandTower();
    }

    @Test
    void shouldReturnTrueWhenSondaIsPossibleToLand() {

        Coordinate sondaCoordinate = new Coordinate(5, 5);

        commandTower.launch(sonda, sondaCoordinate, 'N', planet);

        assertTrue(commandTower.isPossibleLand(sonda, sondaCoordinate, planet));
    }

    @Test
    void shouldReturnFalseWhenSondaIsNotPossibleToLand() {

        Coordinate sondaCoordinate = new Coordinate(7, 7);

        commandTower.launch(sonda, sondaCoordinate, 'N', planet);

        assertFalse(commandTower.isPossibleLand(sonda, sondaCoordinate, planet));
    }

    @Test
    void shouldReturnTrueWhenSondaIsPossibleToMove() {

        Coordinate sondaCoordinate = new Coordinate(5, 5);

        char[] commandsList = {'L', 'M', 'R'};

        commandTower.launch(sonda, sondaCoordinate, 'N', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertTrue(commandTower.isPossibleMove(sonda, planet));
    }

    @Test
    void shouldReturnFalseWhenSondaIsNotPossibleToMove() {

        Coordinate sondaCoordinate = new Coordinate(6, 6);

        char[] commandsList = {'L', 'M', 'R'};

        commandTower.launch(sonda, sondaCoordinate, 'S', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertFalse(commandTower.isPossibleMove(sonda, planet));
    }

    @Test
    void shouldMoveToNorthOnePosition() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'M'};

        commandTower.launch(sonda, sondaCoordinate, 'N', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(3, sonda.getCoordinate().getY());
    }

    @Test
    void shouldMoveToSouthOnePosition() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'M'};

        commandTower.launch(sonda, sondaCoordinate, 'S', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(1, sonda.getCoordinate().getY());
    }

    @Test
    void shouldMoveToEastOnePosition() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'M'};

        commandTower.launch(sonda, sondaCoordinate, 'E', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(2, sonda.getCoordinate().getX());
    }

    @Test
    void shouldMoveToWestOnePosition() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'M'};

        commandTower.launch(sonda, sondaCoordinate, 'W', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(0, sonda.getCoordinate().getX());
    }

    @Test
    void directionShouldBeEastWhenTurnToRightFromNorth() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'R'};

        commandTower.launch(sonda, sondaCoordinate, 'N', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.EAST, sonda.getDirection());
    }

    @Test
    void directionShouldBeSouthWhenTurnToRightFromEast() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'R'};

        commandTower.launch(sonda, sondaCoordinate, 'E', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.SOUTH, sonda.getDirection());
    }

    @Test
    void directionShouldBeWestWhenTurnToRightFromSouth() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'R'};

        CommandTower commandTower = new CommandTower();

        commandTower.launch(sonda, sondaCoordinate, 'S', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.WEST, sonda.getDirection());
    }

    @Test
    void directionShouldBeNorthWhenTurnToRightFromWest() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'R'};

        commandTower.launch(sonda, sondaCoordinate, 'W', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.NORTH, sonda.getDirection());
    }

    @Test
    void directionShouldBeWestWhenTurnToLeftFromNorth() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'L'};

        commandTower.launch(sonda, sondaCoordinate, 'N', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.WEST, sonda.getDirection());
    }

    @Test
    void directionShouldBeSouthWhenTurnToLeftFromWest() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'L'};

        commandTower.launch(sonda, sondaCoordinate, 'W', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.SOUTH, sonda.getDirection());
    }

    @Test
    void directionShouldBeEastWhenTurnToLeftFromSouth() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'L'};

        commandTower.launch(sonda, sondaCoordinate, 'S', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.EAST, sonda.getDirection());
    }

    @Test
    void directionShouldBeNorthWhenTurnToLeftFromEast() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'L'};

        commandTower.launch(sonda, sondaCoordinate, 'E', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.NORTH, sonda.getDirection());
    }
}