
public class Planeta {

	private final int limiteX;
	private final int limiteY;
	
	public Planeta(int x, int y) {
		this.limiteX = x;
		this.limiteY = y;
	}
	
	public void tamanhoPlaneta() {
		System.out.println(limiteX + " " + limiteY);
	}
}
