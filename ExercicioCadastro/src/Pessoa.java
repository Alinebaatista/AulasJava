
public class Pessoa  {

	private String Nome;
	private int Idade;

	Endereco endereco;

	private enum SEXO {
		MASCULINO, FEMININO;
	

	}

	SEXO sexo = SEXO.FEMININO;
	SEXO sexo1 = SEXO.MASCULINO;

}
