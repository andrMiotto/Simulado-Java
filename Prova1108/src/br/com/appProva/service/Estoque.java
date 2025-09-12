package br.com.appProva.service;

import java.util.ArrayList;
import java.util.List;

import br.com.appProva.model.*;
import br.com.appProva.view.InterfaceUser;

public class Estoque {
	InterfaceUser interfaceUser = new InterfaceUser();
	Equipamento equipamento = new Equipamento();
	List<Equipamento> estoque;

	public Estoque() {
		estoque = new ArrayList<>();
	}

	public void gerenciarMenuPrincipal() {
	}

	public void gerenciarEstoque(int opcaoMenu) {
		switch (opcaoMenu) {
		case 1:
			cadastrarEquipamento();
			break;
		case 2:
			interfaceUser.listarTodos(estoque);
			break;
		case 3:
			interfaceUser.listarPorTipo(estoque);
			break;
		case 4:
			interfaceUser.pesquisarPorCodigo(estoque);
			break;
		case 5:
			interfaceUser.removerPorCodigo(estoque);
			break;
		case 6:
			interfaceUser.movimentarEstoque(estoque);
			break;
		case 7:
			interfaceUser.exibirRelatorios(estoque);
			break;
		case 8:
			interfaceUser.buscaAvancadaPorNome(estoque);
			break;
		case 9:
			interfaceUser.buscaAvancadaPorPreco(estoque);
			break;
		case 0:
			System.out.println("Sistema WEG - Encerrando...");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}
	
	public void cadastrarEquipamento() {
		try {
			int interfaceCadastro = interfaceUser.menuCadastro();
			
			if (interfaceCadastro == 1) {
				String codigo = interfaceUser.cadastrarCodigoMotor();
				String nome = interfaceUser.cadastrarNomeMotor();
				double preco = interfaceUser.cadastrarPrecoMotor();
				int quantidade = interfaceUser.cadastrarQuantidadeMotor();
				double potencia = interfaceUser.cadastrarPotencia();
				
				MotorEletrico novoMotor = new MotorEletrico(codigo, nome, preco, quantidade, potencia);
				estoque.add(novoMotor);
				System.out.println("Motor elétrico cadastrado com sucesso!");
			} else if (interfaceCadastro == 2) {
				String codigo = interfaceUser.cadastrarCodigoPainel();
				String nome = interfaceUser.cadastrarNomePainel();
				int quantidade = interfaceUser.cadastrarQuantidadePainel();
				double preco = interfaceUser.cadastrarPrecoPainel();
				String tensao = interfaceUser.cadastrarTensao();
				
				PainelControle novoPainel = new PainelControle(codigo, nome, quantidade, preco, tensao);
				estoque.add(novoPainel);
				System.out.println("Painel de controle cadastrado com sucesso!");
			}
		} catch (Exception e) {
			System.out.println("Erro ao cadastrar equipamento: " + e.getMessage());
		}
	}

	public List<Equipamento> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Equipamento> estoque) {
		this.estoque = estoque;
	}

}
