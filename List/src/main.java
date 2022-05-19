		//ARRAY LIST

import java.util.ArrayList;
import java.util.List;//importar os métodos da classe List da JRE.

public class main {

	public static void main(String[] args) {
		List lista = new ArrayList();

		lista.add("abc");
		lista.add(45);
		lista.add(true);

//		//número de elementos da lista = método size() 
//		for (int x = 0; x < lista.size(); x++) {
//			System.out.println(lista.get(x));
//		}
		for (Object valor : lista) {
			System.out.println(valor);

		}
		//Método remove remove um valor da lista colocando o próxi mo valor no lugar.
		System.out.println();
		lista.remove(0);
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();

		//Método add adiciona valores á lista.
		lista.add(0, "h");
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();

		// Mètodo set subistitui um item da lista por outro.
		lista.set(0, "oiiii");
		for (Object valor : lista) {
			System.out.println(valor);
		}
		
		//Método clear limpa a lista deletando os valores dela.
		System.out.println();
		lista.clear();
		if (lista.isEmpty()) {
			System.out.println("Sua lista está vazia");
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
