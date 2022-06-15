import java.util.Iterator;

public class Temperatura {

	public static void main(String[] args) {
		double C, K, F, Re, Ra;
		C = 2.43;

		K = C + 273.15;
		Re = C * 0.8;
		Ra = C * 1.8 + 32 + 459.67;
		F = C * 1.8 + 32;

		System.out.println("A temperatura em Fahrenheit é :" + F);
		System.out.println("A temperatura em Réamur  é :" + Re);
		System.out.println("A temperatura em  Rankine é :" + Ra);
		System.out.println("A temperatura em Kelvin é :" + K);

	}

}