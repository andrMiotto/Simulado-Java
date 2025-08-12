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
			int interfaceCadastro = interfaceUser.menuCadastro();
			
			if (interfaceCadastro == 1) {
				String codigo = interfaceUser.cadastrarCodigoMotor();
				String nome = interfaceUser.cadastrarNomeMotor();
				double preco = interfaceUser.cadastrarPrecoMotor();
				int quantidade = interfaceUser.cadastrarQuantidadeMotor();
				double potencia = interfaceUser.cadastrarPotencia();
				
				MotorEletrico novoMotor = new MotorEletrico(codigo,nome,preco,quantidade, potencia);
				estoque.add(novoMotor);
				System.out.println("Fruta cadastrada com sucesso!");
			} else if (interfaceCadastro == 2) {
				interfaceUser.cadastrarPainel();

			}
			break;
		case 2:
			
			
		 interfaceUser.listarTodos(estoque);
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 0:
			System.out.println("Sistema de WEG - Encerrando...");
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

	public List<Equipamento> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Equipamento> estoque) {
		this.estoque = estoque;
	}

}
