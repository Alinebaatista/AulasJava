
public class main {
	// final determina que ela vai ser constante
	public static final double PI = 3.14;// Constantedo tipo primitivo

	public static void main(String[] args) {

		double pi = main.PI;// acessar a constante
		
		//Cria��o d e Enum na clsse principal
		private enum  SEXO{
			MASCULINO,FEMININO;
		}

		// nele s� � poss�vel adicionar o endere�o do objeto
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;

		int num = DiaDaSemana.SEGUNDA.getNum();
		System.out.println(num);

		// Convers�o de valores
		String s = "TERCA";
		hoje = DiaDaSemana.valueOf(s);
		System.out.println(hoje.getNum());

		SEXO sexo = SEXO.FEMININO;
		sexo = SEXO.MASCULINO;
		
			
		
	}

}
