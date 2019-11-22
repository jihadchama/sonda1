
public class testaSonda {
	
	public static void main(String[] args) {
		
		Planeta marte = new Planeta(6, 6);
		
		marte.tamanhoPlaneta(); 
		// 6 6
		
		Sonda sonda1 = new Sonda(2, 3);
		
		sonda1.currentPosition();
		// 2 3 NORTH
	
		sonda1.move();
				
		sonda1.turn("R");
					
		sonda1.currentPosition();
		// 2 4 EAST
		
		sonda1.move();
		
		sonda1.currentPosition();
		// 3 4 EAST
	}

}
