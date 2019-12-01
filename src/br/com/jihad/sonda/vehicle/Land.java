package br.com.jihad.sonda.vehicle;

import br.com.jihad.sonda.model.Coordinate;
import br.com.jihad.sonda.model.Directions;
import br.com.jihad.sonda.planet.Planet;

public interface Land {
    void land(Coordinate coordinate, Directions direction, Planet planet);
}