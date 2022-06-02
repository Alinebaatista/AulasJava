
public class Pessoa  {

	private String nome;
	private int idade;
	private Endereco endereco;
	private Sexo sexo;

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo masculino) {
		this.sexo = masculino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;

		
		
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + ", sexo=" + sexo + "]";
	}

	
}
