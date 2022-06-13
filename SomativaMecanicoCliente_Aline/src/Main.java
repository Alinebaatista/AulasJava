import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		// intanciamneto dos objetos
		Mecanico mecanico1 = new Mecanico("Antonio", 1063587, 300);
		Mecanico mecanico2 = new Mecanico("Tonhão", 578214, 685);

		Servico servico1 = new Servico("Troca Radiador", 5, 200, mecanico1);
		Servico servico2 = new Servico("Vistoria", 5, 150, mecanico2);

		Cliente cliente1 = new Cliente("Julia", 768145, servico1, FormaPag.A_VISTA);
		Cliente cliente2 = new Cliente("Claudio", 845812, servico1, FormaPag.CARNE);
		Cliente cliente3 = new Cliente("Beatriz", 45896, servico2, FormaPag.A_VISTA);
		Cliente cliente4 = new Cliente("Matheus", 36589, servico2, FormaPag.CARTAO_CREDITO);

		//
		// LISTA
		//

		List<Cliente> listaDeClientes = new ArrayList<Cliente>();
		listaDeClientes.add(cliente1);
		listaDeClientes.add(cliente2);
		listaDeClientes.add(cliente3);
		listaDeClientes.add(cliente4);

		for (Cliente cliente : listaDeClientes) {

			System.out.println("As informações dos clientes são:");
			System.out.println("Nome :" + cliente.getNome());
			System.out.println("CPF :" + cliente.getCpf(0));
			System.out.println("As informações do serviço são: " + cliente.getServico().getNome());
			System.out.println("Com  o total de: " + cliente.getServico().getQtdHorasServico() + " horas");
			System.out.println("A Forma de Pagamento Foi: " + cliente.getFormaPag());
			System.out.println("-------------------------------------------------------------");

						// ESCREVER

			try (BufferedWriter escrever = new BufferedWriter(new FileWriter("cliente.txt"))) {
				escrever.write(cliente.toString());
			}

		}

	}
}
