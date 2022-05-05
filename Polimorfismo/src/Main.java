
public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Cachorro(); //polimorfismo: é possível criar uma instância de cachorro a partir da superclasse que ela extende/herda.
		
		animal.falar();
		
		animal = new Gato();
		
		animal.falar();
	}
.
}
