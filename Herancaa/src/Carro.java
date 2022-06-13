
public class Carro extends Veiculo { //extends faz com que a classe herde os métodos da classe pai
	private boolean quatroPortas;

	@Override
	public void imprimir() {

		super.imprimir();
		System.out.println("Tem 4 portas!" + quatroPortas);
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

	
	
	
}
