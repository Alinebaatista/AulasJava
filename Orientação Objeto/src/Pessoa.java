
public class Pessoa {
 String nome;
 int numFigurinhas;
 
 void receber (int numFigurinhas) {
	 this.numFigurinhas  += numFigurinhas;
			 
}
 
 	boolean dar(int numFigurinhas,Pessoa pessoa) {
 		
 		if(this.numFigurinhas<numFigurinhas)
 		System.out.println("A quantidade de figurinhas n�o s�o suficientes!");
 		return false;
 	}
 	
 	else {
 		this.numFigurinhas -= numFigurinhas;
 		Pessoa.receber(numFigurinhas);
 		return true;
 	}
}
