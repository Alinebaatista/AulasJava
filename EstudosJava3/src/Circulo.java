
public class Circulo extends Figura {
	private double raio;

	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circulo(String cor) {
		super(cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}

	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	
	
}
