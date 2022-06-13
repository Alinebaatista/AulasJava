
public class Mecanico extends Usuario {

	private double MaoDeObra ;

	//constructor
	public Mecanico(String nome, int cpf, double maoDeObra) {
		super(nome, cpf);
		MaoDeObra = maoDeObra;
	}

	//Getters and setters
	public double getMaoDeObra() {
		return MaoDeObra;
	}

	public void setMaoDeObra(double maoDeObra) {
		MaoDeObra = maoDeObra;
	}
//toString
	@Override
	public String toString() {
		return "Mecanico [MaoDeObra=" + MaoDeObra + "]";
	}
	
	
}
