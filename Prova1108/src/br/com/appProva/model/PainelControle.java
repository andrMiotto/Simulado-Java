package br.com.appProva.model;

public class PainelControle extends Equipamento {

	private String tensao;

	public PainelControle() {
		super();
		this.tensao = "";
	}

	public PainelControle(String codigo, String nome, int quantidade, double preco) {
		super(codigo, nome, quantidade, preco);
		this.tensao = tensao;
	}

	public String getPotencia() {
		return tensao;
	}

	public void setPotencia(String tensao) {
		this.tensao = tensao;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + "Nome: " + nome + "Quantidade: " + quantidade + "Preço: R$ " + preco + "Potencia: "
				+ tensao;
	}
}
