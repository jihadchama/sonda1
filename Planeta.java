
public class Planeta {

	private int limiteX;
	private int limiteY;
	
	public Planeta(int x, int y) {
		this.limiteX = x;
		this.limiteY = y;
	}
	
	public void setLimiteX(int limiteX) {
		this.limiteX = limiteX;
	}
	
	public void setLimiteY(int limiteY) {
		this.limiteY = limiteY;
	}
	
	public int getLimiteX() {
		return limiteX;
	}
	
	public int getLimiteY() {
		return limiteY;
	}
	
	public void tamanhoPlaneta() {
		System.out.println(limiteX + " " + limiteY);
	}
}
