		//ARRAY LIST

import java.util.ArrayList;
import java.util.List;//importar os m�todos da classe List da JRE.

public class main {

	public static void main(String[] args) {
		List lista = new ArrayList();

		lista.add("abc");
		lista.add(45);
		lista.add(true);

//		//n�mero de elementos da lista = m�todo size() 
//		for (int x = 0; x < lista.size(); x++) {
//			System.out.println(lista.get(x));
//		}
		for (Object valor : lista) {
			System.out.println(valor);

		}
		//M�todo remove remove um valor da lista colocando o pr�xi mo valor no lugar.
		System.out.println();
		lista.remove(0);
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();

		//M�todo add adiciona valores � lista.
		lista.add(0, "h");
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();

		// M�todo set subistitui um item da lista por outro.
		lista.set(0, "oiiii");
		for (Object valor : lista) {
			System.out.println(valor);
		}
		
		//M�todo clear limpa a lista deletando os valores dela.
		System.out.println();
		lista.clear();
		if (lista.isEmpty()) {
			System.out.println("Sua lista est� vazia");
		}
		
		Conta conta1 = new Conta("Aggua" ,60.00);
		Conta conta2 = new Conta("Luz" ,60.00);
		
		List < Conta> listaDeContas = new ArrayList<Conta>();
		
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		for(Conta conta : listaDeContas) {
			System.out.println(conta);
		}
	}

}
