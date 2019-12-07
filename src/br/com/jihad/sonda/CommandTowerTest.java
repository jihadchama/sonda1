package br.com.jihad.sonda;

import br.com.jihad.sonda.model.Coordinate;
import br.com.jihad.sonda.planet.Planet;
import br.com.jihad.sonda.vehicle.Sonda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CommandTowerTest {

    @Test
    void shouldReturnTrueWhenSondaIsPossibleToLand(){

        Coordinate coordinate = new Coordinate(6, 6);
        Coordinate sondaCoordinate = new Coordinate(5, 5);
        Planet planet = new Planet(coordinate);
        Sonda sonda = new Sonda();

        CommandTower commandTower = new CommandTower();

        commandTower.launch(sonda, sondaCoordinate, 'N', planet);

        assertTrue(commandTower.isPossibleLand(sonda, sondaCoordinate, planet));
    }

    @Test
    void shouldReturnFalseWhenSondaIsPossibleToLand(){

        Coordinate coordinate = new Coordinate(2, 2);
        Coordinate sondaCoordinate = new Coordinate(5, 5);
        Planet planet = new Planet(coordinate);
        Sonda sonda = new Sonda();

        CommandTower commandTower = new CommandTower();

        commandTower.launch(sonda, sondaCoordinate, 'N', planet);

        assertFalse(commandTower.isPossibleLand(sonda, sondaCoordinate, planet));
    }

    @Test
    void shouldReturnTrueWhenSondaIsPossibleToMove(){

        Coordinate coordinate = new Coordinate(6, 6);
        Coordinate sondaCoordinate = new Coordinate(5, 5);
        Planet planet = new Planet(coordinate);
        Sonda sonda = new Sonda();
        char[] commandsList = {'L', 'M', 'R'};

        CommandTower commandTower = new CommandTower();

        commandTower.launch(sonda, sondaCoordinate, 'N', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertTrue(commandTower.isPossibleMove(sonda, planet));
    }

    @Test
    void shouldReturnFalseWhenSondaIsPossibleToMove(){

        Coordinate coordinate = new Coordinate(6, 6);
        Coordinate sondaCoordinate = new Coordinate(6, 6);
        Planet planet = new Planet(coordinate);
        Sonda sonda = new Sonda();
        char[] commandsList = {'L', 'M', 'R'};

        CommandTower commandTower = new CommandTower();

        commandTower.launch(sonda, sondaCoordinate, 'S', planet);

        commandTower.movement(sonda, commandsList, planet);

        assertFalse(commandTower.isPossibleMove(sonda, planet));
    }
}
