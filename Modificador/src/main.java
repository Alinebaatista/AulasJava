
public class main {

	public static void main(String[] args) {

		Contabancaria conta1 = new Contabancaria();

//		conta1.ativo = true;
//		conta1.numConta = 1256;
//		conta1.saldo = 1000.50;

//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);

		conta1.receber(100.8);
		conta1.saldo();
		conta1.dar(110);

		System.out.println(conta1.saldo());
		Contabancaria conta2 = new Contabancaria();
		System.out.println(conta2.saldo());
	}

}
