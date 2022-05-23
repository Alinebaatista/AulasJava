
public enum DiaDaSemana {
	// Constantes São  escritas em Caixa Alta
	// Enum é um tipo de dados que pode ser criado,apos sua criação seus objetos são
	// constantes
	// nele é possivel ter atributos e métodos

	DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);

	// Contrutor
	private int num;

	private DiaDaSemana(int num) {
		this.num = num;
	}

	// Getters
	public int getNum() {
		return num;
	}

}
