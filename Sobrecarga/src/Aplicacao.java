
					// Sobrecarga de metodos 
					// são a criação de mais de um método com o mesmo nome com função e resultados diferentes.
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		Matematica matematica = new Matematica();
				
		 System.out.println("Somar dois Numeros");
		 System.out.println("Digite o primeiro numero:");
		 int x = scanner.nextInt();
		
		 System.out.println("Digite o segundo numero:");
		 int y = scanner.nextInt();
		 
		 
		int soma = matematica.somar(x, y);			
		System.out.println("O resultado da soma é "+ soma );	
			
		soma = matematica.somar(x , y , 5);
		System.out.println("O resultado da soma é "+ soma );	
		   
		double soma2 = matematica.somar(y,x);
		System.out.println("O resultado da soma é "+ soma2 );	
		   
	}

}
