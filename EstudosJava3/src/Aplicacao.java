
public class Aplicacao {

	public static void main(String[] args) {

		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo("Amarelo", 12, 20);
		Retangulo retangulo = new Retangulo("Azul", 220, 10);
		Circulo circulo = new Circulo("Verde", 35);

		triangulo.setCor("Rosa");
		triangulo.setAltura(100);

		System.out.println(triangulo);
		System.out.println(quadrado);
		System.out.println(retangulo);
		System.out.println(circulo);
	}

}
