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
		System.out.println("===============================");
		System.out.println("  Sistema de Controle WEG 2.0");
		System.out.println("===============================");
		System.out.println("");
		System.out.println("1 - Cadastrar Equipamento");
		System.out.println("2 - Listar Todos os Equipamentos");
		System.out.println("3 - Listar Equipamentos por Tipo");
		System.out.println("4 - Pesquisar Equipamento por Código");
		System.out.println("5 - Remover Equipamento por Código");
		System.out.println("6 - Movimentar Estoque (Adicionar/Retirar Quantidade)");
		System.out.println("7 - Relatórios de Estoque");
		System.out.println("8 - Busca Avançada por Nome");
		System.out.println("9 - Busca Avançada por Preço");
		System.out.println("0 - Sair");
		System.out.println("");
		System.out.print("Digite a opção desejada: ");

		try {
			int opcaoMenu = input.nextInt();
			input.nextLine(); // Limpar buffer
			
			if (opcaoMenu < 0 || opcaoMenu > 9) {
				System.out.println("Opção inválida! Tente novamente.");
				return -1;
			}
			return opcaoMenu;
		} catch (Exception e) {
			System.out.println("Entrada inválida! Digite um número.");
			input.nextLine(); // Limpar buffer
			return -1;
		}
	}

	public int menuCadastro() {
		System.out.println("-------- Cadastro de equipamentos --------");
		System.out.println("");
		System.out.println("1 - Motor elétrico");
		System.out.println("2 - Painel de controle");
		System.out.print("Escolha o tipo: ");
		
		try {
			int opcaoMenuCadastro = input.nextInt();
			input.nextLine();
			
			if (opcaoMenuCadastro < 1 || opcaoMenuCadastro > 2) {
				System.out.println("Opção inválida! Digite 1 ou 2.");
				return -1;
			}
			return opcaoMenuCadastro;
		} catch (Exception e) {
			System.out.println("Entrada inválida! Digite um número.");
			input.nextLine();
			return -1;
		}
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
		System.out.println("\n=== LISTA DE EQUIPAMENTOS ===");
		for (int i = 0; i < estoque.size(); i++) {
			System.out.println((i + 1) + " - " + estoque.get(i).toString());
		}
		System.out.println("\nTotal de equipamentos: " + estoque.size());
	}

	public String cadastrarCodigoMotor() {
		System.out.print("Digite o código do motor: ");
		String codigo = input.nextLine();
		if (codigo.trim().isEmpty()) {
			System.out.println("Código não pode estar vazio! Digite novamente.");
			return cadastrarCodigoMotor();
		}
		return codigo;
	}

	public String cadastrarCodigoPainel() {
		System.out.print("Digite o código do painel: ");
		String codigo = input.nextLine();
		if (codigo.trim().isEmpty()) {
			System.out.println("Código não pode estar vazio! Digite novamente.");
			return cadastrarCodigoPainel();
		}
		return codigo;
	}

	public String cadastrarNomePainel() {
		System.out.print("Digite o nome do painel: ");
		String nome = input.nextLine();
		if (nome.trim().isEmpty()) {
			System.out.println("Nome não pode estar vazio! Digite novamente.");
			return cadastrarNomePainel();
		}
		return nome;
	}

	public String cadastrarNomeMotor() {
		System.out.print("Digite o nome do motor: ");
		String nome = input.nextLine();
		if (nome.trim().isEmpty()) {
			System.out.println("Nome não pode estar vazio! Digite novamente.");
			return cadastrarNomeMotor();
		}
		return nome;
	}

	public int cadastrarQuantidadePainel() {
		System.out.print("Digite a quantidade do painel: ");
		try {
			int quantidade = input.nextInt();
			input.nextLine();
			if (quantidade < 0) {
				System.out.println("Quantidade não pode ser negativa! Digite novamente.");
				return cadastrarQuantidadePainel();
			}
			return quantidade;
		} catch (Exception e) {
			System.out.println("Entrada inválida! Digite um número inteiro.");
			input.nextLine();
			return cadastrarQuantidadePainel();
		}
	}

	public int cadastrarQuantidadeMotor() {
		System.out.print("Digite a quantidade do motor: ");
		try {
			int quantidade = input.nextInt();
			input.nextLine();
			if (quantidade < 0) {
				System.out.println("Quantidade não pode ser negativa! Digite novamente.");
				return cadastrarQuantidadeMotor();
			}
			return quantidade;
		} catch (Exception e) {
			System.out.println("Entrada inválida! Digite um número inteiro.");
			input.nextLine();
			return cadastrarQuantidadeMotor();
		}
	}

	public double cadastrarPrecoPainel() {
		System.out.print("Digite o preço do painel: R$ ");
		try {
			double preco = input.nextDouble();
			input.nextLine();
			if (preco < 0) {
				System.out.println("Preço não pode ser negativo! Digite novamente.");
				return cadastrarPrecoPainel();
			}
			return preco;
		} catch (Exception e) {
			System.out.println("Entrada inválida! Digite um número válido.");
			input.nextLine();
			return cadastrarPrecoPainel();
		}
	}

	public double cadastrarPrecoMotor() {
		System.out.print("Digite o preço do motor: R$ ");
		try {
			double preco = input.nextDouble();
			input.nextLine();
			if (preco < 0) {
				System.out.println("Preço não pode ser negativo! Digite novamente.");
				return cadastrarPrecoMotor();
			}
			return preco;
		} catch (Exception e) {
			System.out.println("Entrada inválida! Digite um número válido.");
			input.nextLine();
			return cadastrarPrecoMotor();
		}
	}

	public double cadastrarPotencia() {
		System.out.print("Digite a potência do motor (HP): ");
		try {
			double potencia = input.nextDouble();
			input.nextLine();
			if (potencia < 0) {
				System.out.println("Potência não pode ser negativa! Digite novamente.");
				return cadastrarPotencia();
			}
			return potencia;
		} catch (Exception e) {
			System.out.println("Entrada inválida! Digite um número válido.");
			input.nextLine();
			return cadastrarPotencia();
		}
	}

	public String cadastrarTensao() {
		System.out.print("Digite a tensão do painel: ");
		String tensao = input.nextLine();
		if (tensao.trim().isEmpty()) {
			System.out.println("Tensão não pode estar vazia! Digite novamente.");
			return cadastrarTensao();
		}
		return tensao;
	}
	
	public void listarPorTipo(List<Equipamento> estoque) {
		if (estoque.isEmpty()) {
			System.out.println("Nenhum equipamento cadastrado.");
			return;
		}
		
		System.out.println("=== LISTAR POR TIPO ===");
		System.out.println("1 - Motores Elétricos");
		System.out.println("2 - Painéis de Controle");
		System.out.print("Escolha o tipo: ");
		
		try {
			int tipo = input.nextInt();
			input.nextLine();
			
			System.out.println("\n=== EQUIPAMENTOS DO TIPO SELECIONADO ===");
			boolean encontrou = false;
			
			for (Equipamento equip : estoque) {
				if (tipo == 1 && equip instanceof MotorEletrico) {
					System.out.println(equip.toString());
					encontrou = true;
				} else if (tipo == 2 && equip instanceof PainelControle) {
					System.out.println(equip.toString());
					encontrou = true;
				}
			}
			
			if (!encontrou) {
				System.out.println("Nenhum equipamento do tipo selecionado encontrado.");
			}
		} catch (Exception e) {
			System.out.println("Erro ao listar por tipo: " + e.getMessage());
		}
	}
	
	public void pesquisarPorCodigo(List<Equipamento> estoque) {
		if (estoque.isEmpty()) {
			System.out.println("Nenhum equipamento cadastrado.");
			return;
		}
		
		System.out.print("Digite o código do equipamento: ");
		String codigo = input.nextLine();
		
		boolean encontrou = false;
		for (Equipamento equip : estoque) {
			if (equip.getCodigo().equalsIgnoreCase(codigo)) {
				System.out.println("\n=== EQUIPAMENTO ENCONTRADO ===");
				System.out.println(equip.toString());
				encontrou = true;
				break;
			}
		}
		
		if (!encontrou) {
			System.out.println("Equipamento não encontrado com o código: " + codigo);
		}
	}
	
	public void removerPorCodigo(List<Equipamento> estoque) {
		if (estoque.isEmpty()) {
			System.out.println("Nenhum equipamento cadastrado.");
			return;
		}
		
		System.out.print("Digite o código do equipamento a ser removido: ");
		String codigo = input.nextLine();
		
		boolean removido = false;
		for (int i = 0; i < estoque.size(); i++) {
			if (estoque.get(i).getCodigo().equalsIgnoreCase(codigo)) {
				Equipamento removidoEquip = estoque.remove(i);
				System.out.println("Equipamento removido com sucesso: " + removidoEquip.getNome());
				removido = true;
				break;
			}
		}
		
		if (!removido) {
			System.out.println("Equipamento não encontrado com o código: " + codigo);
		}
	}
	
	public void movimentarEstoque(List<Equipamento> estoque) {
		if (estoque.isEmpty()) {
			System.out.println("Nenhum equipamento cadastrado.");
			return;
		}
		
		System.out.println("=== MOVIMENTAÇÃO DE ESTOQUE ===");
		System.out.print("Digite o código do equipamento: ");
		String codigo = input.nextLine();
		
		Equipamento equipamento = null;
		for (Equipamento equip : estoque) {
			if (equip.getCodigo().equalsIgnoreCase(codigo)) {
				equipamento = equip;
				break;
			}
		}
		
		if (equipamento == null) {
			System.out.println("Equipamento não encontrado com o código: " + codigo);
			return;
		}
		
		System.out.println("Equipamento encontrado: " + equipamento.getNome());
		System.out.println("Quantidade atual: " + equipamento.getQuantidade());
		System.out.println("\n1 - Adicionar unidades");
		System.out.println("2 - Retirar unidades");
		System.out.print("Escolha a operação: ");
		
		try {
			int operacao = input.nextInt();
			System.out.print("Digite a quantidade: ");
			int quantidade = input.nextInt();
			input.nextLine();
			
			if (operacao == 1) {
				equipamento.setQuantidade(equipamento.getQuantidade() + quantidade);
				System.out.println("Quantidade adicionada com sucesso!");
				System.out.println("Nova quantidade: " + equipamento.getQuantidade());
			} else if (operacao == 2) {
				if (quantidade > equipamento.getQuantidade()) {
					System.out.println("Erro: Quantidade insuficiente em estoque!");
					System.out.println("Quantidade disponível: " + equipamento.getQuantidade());
				} else {
					equipamento.setQuantidade(equipamento.getQuantidade() - quantidade);
					System.out.println("Quantidade retirada com sucesso!");
					System.out.println("Nova quantidade: " + equipamento.getQuantidade());
				}
			} else {
				System.out.println("Operação inválida!");
			}
		} catch (Exception e) {
			System.out.println("Erro na movimentação: " + e.getMessage());
		}
	}
	
	public void exibirRelatorios(List<Equipamento> estoque) {
		if (estoque.isEmpty()) {
			System.out.println("Nenhum equipamento cadastrado.");
			return;
		}
		
		System.out.println("\n=== RELATÓRIOS DE ESTOQUE ===");
		
		int totalEquipamentos = 0;
		for (Equipamento equip : estoque) {
			totalEquipamentos += equip.getQuantidade();
		}
		System.out.println("Quantidade total de equipamentos em estoque: " + totalEquipamentos);
		
		Equipamento maiorPreco = estoque.get(0);
		for (Equipamento equip : estoque) {
			if (equip.getPreco() > maiorPreco.getPreco()) {
				maiorPreco = equip;
			}
		}
		System.out.println("Equipamento com maior preço: " + maiorPreco.getNome() + " - R$ " + String.format("%.2f", maiorPreco.getPreco()));
		
		Equipamento maiorQuantidade = estoque.get(0);
		for (Equipamento equip : estoque) {
			if (equip.getQuantidade() > maiorQuantidade.getQuantidade()) {
				maiorQuantidade = equip;
			}
		}
		System.out.println("Equipamento com maior quantidade: " + maiorQuantidade.getNome() + " - " + maiorQuantidade.getQuantidade() + " unidades");
		
		System.out.println("\nEquipamentos com estoque baixo (quantidade < 5):");
		boolean temEstoqueBaixo = false;
		for (Equipamento equip : estoque) {
			if (equip.getQuantidade() < 5) {
				System.out.println("- " + equip.getNome() + " (" + equip.getCodigo() + ") - " + equip.getQuantidade() + " unidades");
				temEstoqueBaixo = true;
			}
		}
		if (!temEstoqueBaixo) {
			System.out.println("Nenhum equipamento com estoque baixo.");
		}
	}
	
	public void buscaAvancadaPorNome(List<Equipamento> estoque) {
		if (estoque.isEmpty()) {
			System.out.println("Nenhum equipamento cadastrado.");
			return;
		}
		
		System.out.print("Digite parte do nome do equipamento: ");
		String parteNome = input.nextLine();
		
		System.out.println("\n=== EQUIPAMENTOS ENCONTRADOS ===");
		boolean encontrou = false;
		for (Equipamento equip : estoque) {
			if (equip.getNome().toLowerCase().contains(parteNome.toLowerCase())) {
				System.out.println(equip.toString());
				encontrou = true;
			}
		}
		
		if (!encontrou) {
			System.out.println("Nenhum equipamento encontrado com o nome contendo: " + parteNome);
		}
	}
	
	public void buscaAvancadaPorPreco(List<Equipamento> estoque) {
		if (estoque.isEmpty()) {
			System.out.println("Nenhum equipamento cadastrado.");
			return;
		}
		
		System.out.print("Digite o valor mínimo de preço: R$ ");
		
		try {
			double precoMinimo = input.nextDouble();
			input.nextLine();
			
			System.out.println("\n=== EQUIPAMENTOS COM PREÇO ACIMA DE R$ " + String.format("%.2f", precoMinimo) + " ===");
			boolean encontrou = false;
			for (Equipamento equip : estoque) {
				if (equip.getPreco() > precoMinimo) {
					System.out.println(equip.toString());
					encontrou = true;
				}
			}
			
			if (!encontrou) {
				System.out.println("Nenhum equipamento encontrado com preço acima de R$ " + String.format("%.2f", precoMinimo));
			}
		} catch (Exception e) {
			System.out.println("Erro ao processar valor: " + e.getMessage());
		}
	}

}
