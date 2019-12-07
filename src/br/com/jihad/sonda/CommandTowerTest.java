package br.com.jihad.sonda.test;

import br.com.jihad.sonda.CommandTower;
import br.com.jihad.sonda.model.Coordinate;
import br.com.jihad.sonda.model.Directions;
import br.com.jihad.sonda.planet.Planet;
import br.com.jihad.sonda.vehicle.Sonda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class CommandTowerTest {

    @Test
    public void shouldReturnTrueWhenSondaIsPossibleToLand(){

        Coordinate coordinate = new Coordinate(6, 6);
        Coordinate sondaCoordinate = new Coordinate(5, 5);
        Planet planet = new Planet(coordinate);
        Sonda sonda = new Sonda();

        CommandTower commandTower = new CommandTower();

        commandTower.launch(sonda, sondaCoordinate, 'N', planet);

        assertTrue(commandTower.isPossibleLand(sonda, sondaCoordinate, planet));
    }
}
