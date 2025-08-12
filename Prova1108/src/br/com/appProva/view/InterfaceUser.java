package br.com.appProva.view;

import java.util.List;
import java.util.Scanner;

import br.com.appProva.model.Equipamento;

public class InterfaceUser {

	static Scanner input;

	public InterfaceUser() {
		input = new Scanner(System.in);
	}

	public int menuPrincipal() {

		System.out.println("-------- WEG --------");
		System.out.println("");
		System.out.println("1 - Cadastrar equipamento");
		System.out.println("2- Listar todos os equipamentos");
		System.out.println("3- Listar por tipo");
		System.out.println("4- Pesquisar por código");
		System.out.println("5- Remover por código");
		System.out.println("6- Movimentar estoque");

		System.out.println("0 - Sair");
		System.out.println("");
		System.out.print("-------> ");

		int opcaoMenu = input.nextInt();

		if (opcaoMenu < 0 || opcaoMenu > 6) {

			System.out.println("Opcao invalida");

		}
		return opcaoMenu;

	}

	public int menuCadastro() {

		int opcaoMenuCadastro;
		System.out.println("-------- Cadastro de equipamentos --------");
		System.out.println("");
		System.out.println("1 - Motor elétrico");
		System.out.println("2 - Painel de controle");
		opcaoMenuCadastro = input.nextInt();
		input.nextLine();

		return opcaoMenuCadastro;

	}

	public void cadastrarMotor() {

	}

	public void cadastrarPainel() {
		cadastrarCodigoPainel();
		cadastrarNomePainel();
		cadastrarQuantidadePainel();
		cadastrarPrecoPainel();
	}

	public void listarTodos(List<Equipamento> estoque) {
		if (estoque.isEmpty()) {
			System.out.println("Nenhum equipamento cadastrado.");
			return;
		}
		System.out.println("=== LISTA DE EQUIPAMENTOS ===");
		for (int i = 0; i < estoque.size(); i++) {
			System.out.println((i + 1) + " - " + estoque.get(i).toString());
		}
	}

	// Código
	public String cadastrarCodigoMotor() {
		System.out.println("Digite o código");
		String codigo = input.nextLine();
		return codigo;
	}

	public String cadastrarCodigoPainel() {
		System.out.println("Digite o código");
		String codigo = input.nextLine();
		return codigo;
	}

	// Nome
	public String cadastrarNomePainel() {
		System.out.print("Digite o nome do painel: ");
		String nome = input.nextLine();
		return nome;
	}

	public String cadastrarNomeMotor() {
		System.out.print("Digite o nome do motor: ");
		String nome = input.nextLine();
		return nome;
	}

	// Quantidade
	public int cadastrarQuantidadePainel() {
		System.out.print("Digite a quantidade do painel: ");
		int quantidade = input.nextInt();
		return quantidade;
	}

	public int cadastrarQuantidadeMotor() {
		System.out.print("Digite a quantidade do motor: ");
		int quantidade = input.nextInt();
		return quantidade;
	}

	// Preço
	public double cadastrarPrecoPainel() {
		System.out.print("Digite o preço do painel: ");
		double preco = input.nextDouble();
		return preco;
	}

	public double cadastrarPrecoMotor() {
		System.out.print("Digite o preço do motor: ");
		double preco = input.nextDouble();
		return preco;
	}

	public double cadastrarPotencia() {
		System.out.print("Digite a potencia do motor: ");
		double potencia = input.nextDouble();
		return potencia;
	}

	public String cadastrarTensao() {
		System.out.print("Digite a tensao do painel: ");
		String tensao = input.nextLine();
		return tensao;
	}

}
