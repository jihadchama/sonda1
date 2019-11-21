
public class testaSonda {
	
	public static void main(String[] args) {
		
		Planeta marte = new Planeta(6, 6);
		
		marte.tamanhoPlaneta(); 
		
		Sonda sonda1 = new Sonda(2, 3, "W");
		
		sonda1.posicaoAtual();
	
		sonda1.move();
				
		sonda1.turn("R");
					
		sonda1.posicaoAtual();
	}

}
