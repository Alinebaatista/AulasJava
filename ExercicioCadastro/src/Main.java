import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//importar para o usuario digitar o que se pede

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();

		List lista = new ArrayList();

		// Apresentar dados na tela para o usuario e inserir dados
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os Dados Da 1 Pessoa");
		System.out.println();

		System.out.println("Digite o Nome:");
		entrada.nextLine();
		System.out.println("Digite a Idade:");
		entrada.nextLine();

		System.out.println("Digite o endereço:");
		entrada.nextLine();

	}

}
