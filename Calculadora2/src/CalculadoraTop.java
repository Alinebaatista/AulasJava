import java.util.Scanner;

public class CalculadoraTop {

	public static void main(String[] args) {
		
	int n1;
	int n2;
	
	String op = "";
	int control = 0; 
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite a operação desejada (+ , -, *, /): ");
	op= entrada.nextLine();//proxima linha //
	
	System.out.println("Digite um valor :");
	n1 = Integer.parseInt(entrada.nextLine());//passando string para inteiro//
	
	System.out.println("Digite o segundo valor");
	n2 = Integer.parseInt(entrada.nextLine());//passando string para inteiro//
	
		if(op.equals("+")) {
		System.out.println("O resutado da soma é: " + (n1 + n2));
		control++;
		}
	
		if(op.equals("-")) {
			System.out.println("O resultado da subtração é:" +(n1 - n2 ));
			control++;
		}
	
		if(op.equals("/")) {
				System.out.println("O resutado da divisão é: " + (n1 / n2));
				control++;
		}
			
		if(op.equals("*")) {
				System.out.println("O resutado da multiplicação é: " + (n1 * n2));
				control++;
		}
	
	if(control == 0) {
	System.out.println("Operação invalida,  Tente Novamente!");
	
	}

	}

}


