import java.util.Scanner;

public class CalculadoraTop {

	public static void main(String[] args) {
	int n1;
	int n2;
	
	String op = "";
	int control = 0; 
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite a opera��o desejada (+ , -, *, /): ");
	op= entrada.nextLine();//proxima linha //
	
	System.out.println("Digite um valor :");
	n1 = Integer.parseInt(entrada.nextLine());//passando string para inteiro//
	
	System.out.println("Digite o segundo valor");
	n2 = Integer.parseInt(entrada.nextLine());//passando string para inteiro//
	
		if(op.equals("+")) {
		System.out.println("O resutado da soma �: " + (n1 + n2));
		control++;
		}
	
		if(op.equals("-")) {
			System.out.println("O resultado da subtra��o �:" +(n1 - n2 ));
			control++;
		}
	
		if(op.equals("/")) {
				System.out.println("O resutado da divis�o �: " + (n1 / n2));
				control++;
		}
			
		if(op.equals("*")) {
				System.out.println("O resutado da multiplica��o �: " + (n1 * n2));
				control++;
		}
	
	if(control == 0) {
	System.out.println("Opera��o invalida,  Tente Novamente!");
	
	}

	}

}
