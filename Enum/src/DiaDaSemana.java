
public enum DiaDaSemana {
	// Constantes S�o  escritas em Caixa Alta
	// Enum � um tipo de dados que pode ser criado,apos sua cria��o seus objetos s�o
	// constantes
	// nele � possivel ter atributos e m�todos

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
