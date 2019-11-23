package br.com.jihad.sonda.teste;
import br.com.jihad.sonda.modelo.Planet;
import br.com.jihad.sonda.modelo.Sonda;

public class testaSonda {
	
	public static void main(String[] args) {
		
		Planet mars = new Planet(6, 6);
						
		mars.planetSize(); 
		// 6 6
		
		Sonda sonda1 = new Sonda(2, 3);
		
		sonda1.currentPosition();
		// 2 3 N
	
		sonda1.move();
				
		sonda1.turn("R");
					
		sonda1.currentPosition();
		// 2 4 E
		
		sonda1.move();
		
		sonda1.currentPosition();
		// 3 4 E
		
		sonda1.turn("L");
		
		sonda1.turn("L");
		
		sonda1.currentPosition();
		// 3 4 W		
	}

}
