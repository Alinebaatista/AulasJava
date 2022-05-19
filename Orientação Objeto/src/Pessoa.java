
public class Pessoa {
 String nome;
 int numFigurinhas;
 
 void receber (int numFigurinhas) {
	 this.numFigurinhas  += numFigurinhas;
			 
}
                       //Parametros
 	boolean dar(int numFigurinhas,Pessoa pessoa) {
 		
 		if(this.numFigurinhas<numFigurinhas)
 		System.out.println("A quantidade de figurinhas não são suficientes!");
 		return false;
 	}
 	
 	else {
 		this.numFigurinhas -= numFigurinhas;
 		Pessoa.receber(numFigurinhas);
 		return true;
 	}
}
