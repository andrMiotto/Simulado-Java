package br.com.appProva.model;

public class Equipamento {

	protected String codigo;
	protected String nome;
	protected int quantidade;
	protected double preco;

	public Equipamento() {

		this.setCodigo("");
		this.setNome("");
		this.setQuantidade(0);
		this.setPreco(0.0);
	}

	public Equipamento(String codigo, String nome, int quantidade, double preco) {

		this.setCodigo(codigo);
		this.setNome(nome);
		this.setQuantidade(quantidade);
		this.setPreco(preco);

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Codigo: "+codigo+"Nome: "+nome+"Quantidade: "+quantidade+"Preço: R$ "+preco;
	}
	
	
	

}
