
public class main {

	public static void main(String[] args) {

		Conta conta = new Conta(100.0, 10.0);
		Conta conta2 = new Conta(120.0, 20.0);

		Cliente cliente1 = new Cliente("julia", 5874, conta2);
		Cliente cliente2 = new Cliente("EUU", 4500, conta);

		// ----------------------Testes boolean--------------------------

		if (cliente1.getConta().Sacar(100) == true) {
			System.out.println("Saque realizado com sucesso!!");
		} else {
			System.out.println("Saque não realizado slado insuficiente! ");
		}
		System.out.println("Seu saldo atual é de " + cliente1.getConta().getSaldo());

		// ----------------------Testes com magic numbers--------------------------

		switch (cliente1.getConta().sacarMN(100)) {
		case 100:
			System.out.println("Saque realizado com sucesso!");
			break;
		case 101:
			System.out.println("Saque realizado com sucesso , mas voce esta usando seu limite");
			break;
		case 102:
			System.out.println("operação não realizada pos voc não tem limite");
			break;
		}
		// ----------------------Testes com exception--------------------------

		try {
			cliente1.getConta().sacarEX((double) 1102);

		} catch (ContaExcpetion e) {
			e.printStackTrace();
			System.out.println("Não foi possivel relziar a operação" + e.getMessage());
		}
	}

}