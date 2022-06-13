
public class Servico {
	private String nome;
	private double qtdHorasServico;
	private double valorhoraServico;
	private Mecanico mecanico;
	
	//Constructor
	public Servico(String nome, double qtdHorasServico, double valorhoraServico, Mecanico mecanico) {
		super();
		this.nome = nome;
		this.qtdHorasServico = qtdHorasServico;
		this.valorhoraServico = valorhoraServico;
		this.mecanico = mecanico;
	}

	public String getNome() {
		return nome;
	}

	
	//getters and setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQtdHorasServico() {
		return qtdHorasServico;
	}

	public void setQtdHorasServico(double qtdHorasServico) {
		this.qtdHorasServico = qtdHorasServico;
	}

	public double getValorhoraServico() {
		return valorhoraServico;
	}

	public void setValorhoraServico(double valorhoraServico) {
		this.valorhoraServico = valorhoraServico;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}
	
	//toString

	@Override
	public String toString() {
		return "Servico [nome=" + nome + ", qtdHorasServico=" + qtdHorasServico + ", valorhoraServico="
				+ valorhoraServico + ", mecanico=" + mecanico + "]";
	}
	
	
	

}
