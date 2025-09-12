package br.com.appProva;

import br.com.appProva.model.Equipamento;
import br.com.appProva.service.Estoque;
import br.com.appProva.view.InterfaceUser;

public class Prova {

	public static void main(String[] args) {

		Estoque estoque = new Estoque();
		Equipamento equipamento = new Equipamento();
		InterfaceUser interfaceU = new InterfaceUser();


		while(true) {
			int opcaoMenu = interfaceU.menuPrincipal();
			if (opcaoMenu != -1) {
				estoque.gerenciarEstoque(opcaoMenu);
			}
		}

	}

}
