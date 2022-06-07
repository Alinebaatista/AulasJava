
public class main {
	// final determina que ela vai ser constante
	public static final double PI = 3.14;// Constante do tipo primitivo

	public static void main(String[] args) {

		double pi = main.PI;// acessar a constante
		
		//Criação de Enum na classe principal
		private enum  SEXO{
			MASCULINO,FEMININO;
		}

		// nele só é possível adicionar o endereço do objeto
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;

		int num = DiaDaSemana.SEGUNDA.getNum();
		System.out.println(num);

		// Conversão de valores
		String s = "TERCA";
		hoje = DiaDaSemana.valueOf(s);
		System.out.println(hoje.getNum());

		SEXO sexo = SEXO.FEMININO;
		sexo = SEXO.MASCULINO;
		
			
		
	}

}
