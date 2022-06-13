
public class Cliente extends Usuario {

	private double valorPagarServico;
	private Servico servico;
	private FormaPag formaPag;
	
	//geters and setters
	public double getValorPagarServico() {
		return valorPagarServico;
	}

	public void setValorPagarServico(double valorPagarServico) {
		this.valorPagarServico = valorPagarServico;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public FormaPag getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(FormaPag formaPag) {
		this.formaPag = formaPag;
	}

	
	
	//Constructor
	public Cliente(String nome, int cpf, Servico servico, FormaPag formaPag) {
		super(nome, cpf);
		this.servico = servico;
		this.formaPag = formaPag;
	}
	
	//to Sritng

	@Override
	public String toString() {
		return "Cliente [valorPagarServico=" + valorPagarServico + ", servico=" + servico + ", formaPag=" + formaPag
				+ "]";
	}

	public void setCpf(Cliente cliente1) {
		// TODO Auto-generated method stub
		
	}

	
	
}
