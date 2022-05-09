
public class Main {

	public static void main(String[] args) {

		Animal animal = new Cachorro(); // polimorfismo: é possível criar uma instância de cachorro a partir da
										// superclasse que ela extende/herda.

		// animal.falar();

		// animal = new Gato();

		// animal.falar();

		Gato gato = new Gato();//obj rip; variavel stack.
		Cachorro cachorro = new Cachorro();
		falar(gato);
		falar(cachorro);

	}

	private static void falar(Animal a) {
		a.falar();

		if (a instanceof Cachorro) {

			Cachorro c = (Cachorro) a;// questing
			c.morder();

		}
	}

}
