package br.com.jihad.sonda.modelo;

public class SondaLauncher {


    public void launchSonda(Sonda sonda, String sentPosition, Coordinate sondaCoordinate, Planet planet){

        if(sentPosition.length() >= 3) {

            switch (sentPosition.charAt(2)) {
                case 'N':
                    sonda.land(sondaCoordinate, Directions.NORTH, planet);
                    break;
                case 'S':
                    sonda.land(sondaCoordinate, Directions.SOUTH, planet);
                    break;
                case 'W':
                    sonda.land(sondaCoordinate, Directions.WEST, planet);
                    break;
                case 'E':
                    sonda.land(sondaCoordinate, Directions.EAST, planet);
                    break;
                default:
                    throw new RuntimeException("Esta não é uma direção válida.");
            }
        } else {
            throw new RuntimeException("O arquivo....");
        }


    }


}
