package br.com.jihad.sonda.modelo;

public class Planet {

	private final int limitX;
	private final int limitY;
	
	public Planet(int x, int y) {
		this.limitX = x;
		this.limitY = y;
	}
	
	public void planetSize() {
		System.out.println(limitX + " " + limitY);
	}
}
