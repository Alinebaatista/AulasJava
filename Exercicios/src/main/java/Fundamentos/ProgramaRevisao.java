package Fundamentos;

import java.util.Scanner;

public class ProgramaRevisao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Funcionario funcionario1 = new Funcionario("aline", "auxilar de produção", 17, 1000);
		Funcionario funcionario2 = new Funcionario("junior", "encaregado", 30, 1200);

		System.out.println("Digite as informacoes dos Funcionarios que deseja Cadastrar!");

		System.out.println("Digite o nome completo:");
		funcionario1.getNome();
		scanner.next();

		System.out.println("Digite a idade:");
		funcionario1.getIdade();
		scanner.nextInt();

		System.out.println("Digite o cargo em que o funcionario trabalha:");
		funcionario1.getCargo();
		scanner.next();

		System.out.println("Digite o salario que o funcionario recebe:");
		funcionario1.getSalario();
		scanner.nextInt();

		//
		// INFORMAÇÃO DO 2 fUNCIONARIO
		//

		System.out.println(
				"  --------------------------------------------------------------------------------------------  ");
		System.out.println();

		System.out.println("Digite as informacoes do 2  Funcionario que deseja Cadastrar!");

		System.out.println("Digite o nome completo :");
		funcionario2.getNome();
		scanner.next();

		System.out.println("Digite a idade:");
		funcionario2.getIdade();
		scanner.nextInt();

		System.out.println("Digite o cargo em que o funcionario trabalha:");
		funcionario2.getCargo();
		scanner.nextLine();

		System.out.println("Digite o salario que o funcionario recebe:");
		funcionario2.getSalario();
		scanner.nextInt();

		System.out.println("A diferenca do salario do Funcionario 1 " + funcionario1.getNome()
				+ " e o funcionario 2 e : " + funcionario2.getNome());

		

	}

}
