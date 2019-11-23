package br.com.jihad.sonda.modelo;

public class Sonda implements Turn, Move {
	

	private int positionX;
	private int positionY;
	private Direction direction = Direction.N;
			
	public Sonda(int x, int y) {
		this.positionX = x;
		this.positionY = y;
		
	}

	public int getPositionX() {
		return this.positionX;
	}

	public int getPositionY() {
		return this.positionY;
	}

	
	public void currentPosition() {
		System.out.println(getPositionX() + " " + getPositionY() + " " + direction.name());
	}

	@Override
	public void move() {

		switch (direction) {
		case N:
			positionY += 1;
			break;
		case S:
			positionY -= 1;
			break;
		case W:
			positionX -= 1;
			break;
		case E:
			positionX += 1;
			break;
		default:
			System.out.println("Esta não é uma direção válida.");
		}
	}

	@Override
	public void turn(String turningDirection) {

		switch(turningDirection) {
		case "R":
			direction = direction.getRight();
		break;
		
		case "L":
			direction = direction.getLeft();
		break;
		
		default:
			System.out.println("Esta não é uma direção válida.");

		}
	}
}