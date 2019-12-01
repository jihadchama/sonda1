package br.com.jihad.sonda.modelo;

public class CommandTower{

    public void launch(Land vehicle, Coordinate coordinate, Directions direction, Planet planet) {

        vehicle.land(coordinate, direction, planet);
    }

}



