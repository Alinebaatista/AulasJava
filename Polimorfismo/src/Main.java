
public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Cachorro(); //polimorfismo: � poss�vel criar uma inst�ncia de cachorro a partir da superclasse que ela extende/herda.
		
		animal.falar();
		
		animal = new Gato();
		
		animal.falar();
	}
.
}
