
public abstract class Figura {

	private String cor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Figura(String cor) {
		super();
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Figura [cor=" + cor + "]";
	}

	public Figura() {

	}

}
