
public class Aplicacao {

	public static void main(String[] args) {

		// metodos estaticos não precisam instanciar um objeto para acessar

		Preparador preparador = new Preparador();

		LeiteQuente leiteQuente = new LeiteQuente();
		Preparador.prepararBebida(leiteQuente);

		Refrigerante refrigerante = new Refrigerante();
		Preparador.prepararBebida(refrigerante);

	}

}
