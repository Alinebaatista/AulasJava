package Fundamentos;

import java.util.Scanner;

public class ProgramaRevisao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Funcionario funcionario1 = new Funcionario("aline", "auxilar de produção", 17, 1500);
		Funcionario funcionario2 = new Funcionario("junior", "encaregado", 30, 1200);

		System.out.println("As informa��es do 1 Funcionario s�o:");
		System.out.println("Nome:" + funcionario1.getNome());
		System.out.println("Idade:" + funcionario1.getIdade());
		System.out.println("Cargo:" + funcionario1.getCargo());
		System.out.println("Salario:" + funcionario1.getSalario());

		System.out.println("-----------------------------------------------------");

		System.out.println("As informa��es do 2 Funcionario s�o:");
		System.out.println("Nome:" + funcionario2.getNome());
		System.out.println("Idade:" + funcionario2.getIdade());
		System.out.println("Cargo:" + funcionario2.getCargo());
		System.out.println("Salario:" + funcionario2.getSalario());

		System.out.println("A diferenca do salario do Funcionario 1 " + funcionario1.getNome() + " e o funcionario 2 "
				+ funcionario2.getNome());
		System.out.println(funcionario1.getSalario() - funcionario2.getSalario());

	}
}
	
