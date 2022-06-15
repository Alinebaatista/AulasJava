import java.util.Scanner;

public class CambioDolarReal {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		double dolar , valor_dolar , valor_real;
		
		
		System.out.println("Converta Dólar em Real ");
		System.out.println("Qual o valor a ser convertido do dolar? Digite");
		dolar = entrada.nextDouble();
		
		System.out.println("Digite o valor em dolar ");
		valor_dolar = entrada.nextDouble();
		
		valor_real = dolar * valor_dolar;
		
		
		System.out.println("O valor em Reais é : " + valor_real );
		
		
		
	}

}
