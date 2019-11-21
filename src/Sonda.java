
public class Sonda implements Turn, Move {

	private int posicaoX;
	private int posicaoY;
	private String direcao;
	
	public Sonda(int x, int y, String direcao) {
		this.posicaoX = x;
		this.posicaoY = y;
		this.direcao = direcao;
	}

	public int getPosicaoX() {
		return this.posicaoX;
	}

	public int getPosicaoY() {
		return this.posicaoY;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getDirecao() {
		return this.direcao;
	}

	public void posicaoAtual() {
		System.out.println(getPosicaoX() + " " + getPosicaoY() + " " + getDirecao());
	}

	@Override
	public void move() {

		switch (this.getDirecao()) {
		case "N":
			posicaoY += 1;
			break;
		case "S":
			posicaoY -= 1;
			break;
		case "W":
			posicaoX -= 1;
			break;
		case "E":
			posicaoX += 1;
			break;
		default:
			System.out.println("Esta n�o � uma dire��o v�lida.");
		}

	}

	@Override
	public void turn(String rotacao) {

		switch (rotacao) {
		
		case "R":

			switch (this.getDirecao()) {

			case "N":
				setDirecao("E");
				break;
			case "E":
				setDirecao("S");
				break;
			case "S":
				setDirecao("W");
				break;
			case "W":
				setDirecao("N");
				break;
			default:
				System.out.println("Esta n�o � uma dire��o v�lida");
				break;
			}
		break;
		
		case "L":

			switch (this.getDirecao()) {

			case "N":
				setDirecao("W");
				break;
			case "W":
				setDirecao("S");
				break;
			case "S":
				setDirecao("E");
				break;
			case "E":
				setDirecao("N");
				break;
			default:
				System.out.println("Esta n�o � uma dire��o v�lida");
				break;
			}
		break;
		
		default:
			System.out.println("A rota��o informada n�o � v�lida, informe R para Direita e L para esquerda");
		}

	}

}
