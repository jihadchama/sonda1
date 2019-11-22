
public class Sonda implements Turn, Move {

	private int positionX;
	private int positionY;
	private String direction;
	
	private enum Direction {
		N, W, S, E;
	}
			
	public Sonda(int x, int y, String direcao) {
		this.positionX = x;
		this.positionY = y;
		this.direction = direcao;
	}

	public int getPosicaoX() {
		return this.positionX;
	}

	public int getPosicaoY() {
		return this.positionY;
	}

	
	public String getDirecao() {
		return this.direction;
	}

	public void posicaoAtual() {
		System.out.println(getPosicaoX() + " " + getPosicaoY() + " " + getDirecao());
	}

	@Override
	public void move() {

		switch (this.getDirecao()) {
		case "N":
			positionY += 1;
			break;
		case "S":
			positionY -= 1;
			break;
		case "W":
			positionX -= 1;
			break;
		case "E":
			positionX += 1;
			break;
		default:
			System.out.println("Esta não é uma direção válida.");
		}

	}

	@Override
	public void turn(String rotacao) {

		switch (rotacao) {
		
		case "R":

			switch (this.getDirecao()) {

			case "N":
				this.direction = "E";
				break;
			case "E":
				this.direction = "S";
				break;
			case "S":
				this.direction = "W";
				break;
			case "W":
				this.direction = "N";
				break;
			default:
				System.out.println("Esta não é uma direção válida");
				break;
			}
		break;
		
		case "L":

			switch (this.getDirecao()) {

			case "N":
				this.direction = "W";
				break;
			case "W":
				this.direction = "S";
				break;
			case "S":
				this.direction = "E";
				break;
			case "E":
				this.direction = "N";
				break;
			default:
				System.out.println("Esta não é uma direção válida");
				break;
			}
		break;
		
		default:
			System.out.println("A rotação informada não é válida, informe R para Direita e L para esquerda");
		}

	}

}
