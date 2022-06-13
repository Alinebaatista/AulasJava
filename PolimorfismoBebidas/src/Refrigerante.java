
public class Refrigerante extends Bebida  {

	public Refrigerante() {  //Construtor
		super ("Refrigerante",false);
		
	}

	@Override  //Sobrepor ou sub escrever
	public void preparar() {
		super.preparar();
		System.out.println("colocando gelo");
		System.out.println("Colocando o refrigerante");
		
	}
	
	
	
}
