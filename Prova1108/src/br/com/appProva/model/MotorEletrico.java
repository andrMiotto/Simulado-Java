package br.com.appProva.model;

public class MotorEletrico extends Equipamento {

	private double potencia;

	public MotorEletrico() {
		super();
		this.potencia = 0.0;
	}

	public MotorEletrico(String codigo, String nome, double preco, int quantidade, double potencia) {
		super(codigo, nome, quantidade, preco);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + "Nome: " + nome + "Quantidade: " + quantidade + "Preço: R$ " + preco + "Potencia: "
				+ potencia;
	}
}
