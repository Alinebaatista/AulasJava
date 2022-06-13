
public class Usuario {

	private String nome;
	protected int cpf;

	// getters and setters
	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf(int i) {
		return cpf;
	}

	
	//Constructor
	public Usuario(String nome, int cpf) {

		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	//toString

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + "]";
	}

	
	
}