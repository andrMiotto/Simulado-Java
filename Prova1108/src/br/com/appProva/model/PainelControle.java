package br.com.appProva.model;

public class PainelControle extends Equipamento {

	private String tensao;

	public PainelControle() {
		super();
		this.tensao = "";
	}

	public PainelControle(String codigo, String nome, int quantidade, double preco, String tensao) {
		super(codigo, nome, quantidade, preco);
		this.tensao = tensao;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	@Override
	public String toString() {
		return "Código: " + getCodigo() + " | Nome: " + getNome() + " | Quantidade: " + getQuantidade() + 
			   " | Preço: R$ " + String.format("%.2f", getPreco()) + " | Tensão: " + tensao;
	}
}
