
public class Apilacao {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();

		veiculo.setMarca("city");
		veiculo.setAno(2020);
		veiculo.setModelo("BMW");
		
		veiculo.imprimir();
		veiculo.buzinar();
	
		System.out.println();
		
		//Carro
	
 Carro carro = new Carro();
	carro.setMarca("Honda");
	carro.setAno(2020);
	carro.setModelo("BMW");
	carro.setQuatroPortas(true);
	

	carro.imprimir();
	carro.buzinar();
	
	System.out.println();
	//Caminhao
	
	Caminhao caminhao = new Caminhao();
	caminhao.setMarca("Honda");
	caminhao.setAno(2020);
	caminhao.setModelo("BMW");

	caminhao.imprimir();
	caminhao.buzinar();
	
System.out.println();

	//Moto
	Moto moto = new Moto();
	 moto.setMarca("Honda");
	 moto.setAno(2020);
	 moto.setModelo("BMW");

	 moto.imprimir();
	 moto.buzinar();
	 moto.empinanar();
}
}
