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

		Scanner scanner = new Scanner(System.in);

		Pessoa pessoa = new Pessoa();

		List<Pessoa> lista = new ArrayList<>();

		System.out.println("Digite o Nome Da Pessoa a Ser Cadastrada");
		pessoa.setNome(null);
		scanner.nextLine();

		System.out.println("Digite a Idade Da Pessoa a Ser Cadastrada");
		pessoa.setIdade(0);
		scanner.nextInt();

		System.out.println("\"Digite o SexoDa Pessoa a Ser Cadastrada\"");
		scanner.nextLine();

		System.out.println("Digite 1 Para Feminino e 2 Para Masculino");
		int opcao = 0;
		while (opcao != 1 && opcao != 2) {
			opcao = scanner.nextInt();
			if (opcao == 2)
				pessoa.setSexo(Sexo.feminino);
			else if (opcao == 1)
				pessoa.setSexo(Sexo.masculino);
			else {
				System.out.println("Algo Deu Errado Tente Novamente");
				System.out.println("Qual o Sexo da Pessoa a Ser Cadastrada?");
			}
		}

		Endereco endereco = new Endereco();
		System.out.println("Digite o Bairro Da Pessoa a Ser Cadastrada");
		endereco.setBairro(null);
		scanner.next();

		System.out.println("Digite o Numero  Da Pessoa a Ser Cadastrada");
		endereco.setNumero(0);
		scanner.nextInt();
		

		System.out.println("Digite a Rua Da Pessoa a Ser Cadastrada");
		endereco.setRua(null);
		scanner.next();

	
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("cadastro.txt"))) {
			for (Pessoa pessoa2 : lista)
			escrever.write(pessoa2.toString());
			
			
					
					lista.add(pessoa);
				}

			
		}
		

	}


