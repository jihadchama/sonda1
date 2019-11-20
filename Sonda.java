
public class Sonda implements Girar, Mover {

	private int posicaoX;
	private int posicaoY;
	private String direcao;
	private String rotacao;

	public Sonda(int x, int y, String coord) {
		this.posicaoX = x;
		this.posicaoY = y;
		this.direcao = coord;
	}

	public void setRotacao(String rotacao) {
		this.rotacao = rotacao;
	}

	public String getRotacao() {
		return rotacao;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoX() {
		return this.posicaoX;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
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
	public void mover() {

		switch (this.getDirecao()) {
		case "N":
			setPosicaoY(posicaoY += 1);
			break;
		case "S":
			setPosicaoY(posicaoY -= 1);
			break;
		case "W":
			setPosicaoX(posicaoX -= 1);
			break;
		case "E":
			setPosicaoX(posicaoX += 1);
			break;
		default:
			System.out.println("Esta não é uma direção válida.");
		}

	}

	@Override
	public void girar() {

		if (getRotacao() == "R") {

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
				System.out.println("Esta não é uma direção válida");
				break;
			}
		} else {

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
				System.out.println("Esta não é uma direção válida");
				break;
			}

		}

	}

}
