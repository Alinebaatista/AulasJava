
public class main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Aline";
		pessoa1.numFigurinhas = 1;
		
				pessoa1.receber(50);
		
				System.out.println(pessoa1.nome);
				System.out.println(pessoa1.numFigurinhas);
				
				Pessoa Pessoa2 = new Pessoa();
				Pessoa2.nome = "Ana";
				Pessoa2.numFigurinhas = 100;
				
				System.out.println(Pessoa2.nome);
				System.out.println(Pessoa2.numFigurinhas);
				
					boolean retorno;
					retorno = pessoa1.dar(50, Pessoa2);
				 	
				 	if(retorno ==  true) {
						
					System.out.println("Depois");
						 
					System.out.println(pessoa1.nome);
					System.out.println(pessoa1.numFigurinhas);
					
					System.out.println(Pessoa2.nome);
					System.out.println(Pessoa2.numFigurinhas);
					
	}
	}
}
