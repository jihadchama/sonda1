
public class testaSonda {
	
	public static void main(String[] args) {
		
		Planeta marte = new Planeta(6, 6);
		
		marte.tamanhoPlaneta(); 
		
		Sonda sonda1 = new Sonda(2, 3, "W");
		
		sonda1.setRotacao("R");
		
		sonda1.posicaoAtual();
	
		sonda1.mover();
				
		sonda1.girar();
					
		sonda1.posicaoAtual();
	}

}
