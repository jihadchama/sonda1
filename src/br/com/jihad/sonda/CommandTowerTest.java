package br.com.jihad.sonda;

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
    public void createSonda() {
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
    void shouldReturnFalseWhenSondaIsPossibleToLand() {

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
    void shouldReturnFalseWhenSondaIsPossibleToMove() {

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

        assertEquals(3, sonda.getCoordinate().getY(), 0.00001);
    }

    @Test
    void shouldMoveToSouthOnePosition() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'M'};

        commandTower.launch(sonda, sondaCoordinate, 'S', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(1, sonda.getCoordinate().getY(), 0.00001);
    }

    @Test
    void shouldMoveToEastOnePosition() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'M'};

        commandTower.launch(sonda, sondaCoordinate, 'E', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(2, sonda.getCoordinate().getX(), 0.00001);
    }

    @Test
    void shouldMoveToWestOnePosition() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'M'};

        commandTower.launch(sonda, sondaCoordinate, 'W', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(0, sonda.getCoordinate().getX(), 0.00001);
    }

    @Test
    void shouldTurnToRightFromNorth() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'R'};

        commandTower.launch(sonda, sondaCoordinate, 'N', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.EAST, sonda.getDirection());
    }

    @Test
    void shouldTurnToRightFromEast() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'R'};

        commandTower.launch(sonda, sondaCoordinate, 'E', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.SOUTH, sonda.getDirection());
    }

    @Test
    void shouldTurnToRightFromSouth() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'R'};

        CommandTower commandTower = new CommandTower();

        commandTower.launch(sonda, sondaCoordinate, 'S', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.WEST, sonda.getDirection());
    }

    @Test
    void shouldTurnToRightFromWest() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'R'};

        commandTower.launch(sonda, sondaCoordinate, 'W', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.NORTH, sonda.getDirection());
    }

    @Test
    void shouldTurnToLeftFromNorth() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'L'};

        commandTower.launch(sonda, sondaCoordinate, 'N', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.WEST, sonda.getDirection());
    }

    @Test
    void shouldTurnToLeftFromWest() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'L'};

        commandTower.launch(sonda, sondaCoordinate, 'W', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.SOUTH, sonda.getDirection());
    }

    @Test
    void shouldTurnToLeftFromSouth() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'L'};

        commandTower.launch(sonda, sondaCoordinate, 'S', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.EAST, sonda.getDirection());
    }

    @Test
    void shouldTurnToLeftFromEast() {

        Coordinate sondaCoordinate = new Coordinate(1, 2);

        char[] commandsList = {'L'};

        commandTower.launch(sonda, sondaCoordinate, 'E', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertEquals(Directions.NORTH, sonda.getDirection());
    }
}
