

public class Mouse {

	private boolean funciona;
	private int qtdBotoes;
	private String tamanho;
	
	//atributos privados precisam do get e set pra serem acessados
	
	
	//constroí na memoria rip a classe
	public Mouse(boolean funciona, int qtdBotoes, String tamanho) {
		super();
		this.funciona = funciona;
		this.qtdBotoes = qtdBotoes;
		this.tamanho = tamanho;
	}
	@Override
	
	public String toString() {
		return "Mouse [funciona= " + funciona + ", qtdBotoes= " + qtdBotoes + ", tamanho= " + tamanho + "]";
	}
	

	public boolean isFunciona() {
		return funciona;
	}
	
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	
	public Mouse() {
		super();
	}
	public int getQtdBotoes() {
		return qtdBotoes;
	}
	
	public void setQtdBotoes(int qtdBotoes) {
		this.qtdBotoes = qtdBotoes;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}


	

	
}
