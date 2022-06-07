
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//importar para o usuario digitar o que se pede

public class Main {

	public static void main(String[] args) throws IOException {
		//
		// ESCREVER NO TXT NOS DADOS PEDIDOS
		//

		Scanner scanner = new Scanner(System.in);

		Pessoa pessoa = new Pessoa();

		List<Pessoa> lista = new ArrayList<>();

		System.out.println("Digite o Nome Da Pessoa a Ser Cadastrada");
		pessoa.setNome("");
		scanner.nextLine();

		System.out.println("Digite a Idade Da Pessoa a Ser Cadastrada");
		pessoa.getIdade();
		scanner.nextInt();

		System.out.println("Qual o Sexo da Pessoa a Ser Cadastrada?");
		scanner.nextLine();

		System.out.println("Digite 1 Para Feminino ou 2 Para Masculino");

		int opcao = 0;
		while (opcao != 1 && opcao != 2) {
			opcao = scanner.nextInt();
			if (opcao == 1)
				pessoa.setSexo(Sexo.feminino);
			else if (opcao == 2)
				pessoa.setSexo(Sexo.masculino);
			else {
				System.out.println("Algo Deu Errado Tente Novamente");
				System.out.println();
				System.out.println("Qual o Sexo da Pessoa a Ser Cadastrada?");
			}
		}

		Endereco endereco = new Endereco();
		
		System.out.println("A Seguir digite os dados do  endereço");
		System.out.println("Digite o Bairro  ");
		endereco.setBairro("");
		scanner.next();

		System.out.println("Digite numero da Casa ");
		endereco.setNumero(0);
		scanner.nextInt();

		System.out.println("Digite o nome da Rua ");
		endereco.setRua("");
		scanner.next();

		lista.add(pessoa);

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("cadastro.txt"))) {
			for (Pessoa pessoa1 : lista)
				escrever.write(pessoa1.toString());
		}

			try (BufferedReader reader = new BufferedReader(new FileReader("cadastro.txt"))) {
				String line;
				String ler = " ";

				while ((line = reader.readLine()) != null) {
					ler += line + "/n";
					
					
				}

			
		}
	}
}



