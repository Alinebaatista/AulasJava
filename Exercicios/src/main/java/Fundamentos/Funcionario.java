package Fundamentos;

public class Funcionario {
	String nome;
	String cargo;
	int idade;
	double salario;

	
	// Gettersand Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	//contructor

	public Funcionario(String nome, String cargo, int idade, double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
	}
	
	
	//toString

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", idade=" + idade + ", salario=" + salario + "]";
	}
	
	
	

	
	