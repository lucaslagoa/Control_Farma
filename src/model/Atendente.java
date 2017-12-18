package model;

import view.Inicial;
import view.PrimeiraProduto;
import view.QuartoProduto;
import view.SegundoProduto;
import view.Tela;
import view.TerceiroProduto;

public class Atendente {

	private static boolean condicao = true;
	Inicial inicial = new Inicial();
	PrimeiraProduto primeira = new PrimeiraProduto();
	SegundoProduto segunda = new SegundoProduto();
	TerceiroProduto terceira = new TerceiroProduto();
	QuartoProduto quarto = new QuartoProduto();
	Tela face = new Tela();
	Inicial telaInicial = new Inicial();

	

	public void fazPedido() throws InterruptedException {
		inicial.setVisible(true);
		while (condicao == true) {
			Thread.sleep(1);
			if (Inicial.menuCadastro == true) {
				inicial.dispose();
				face.setVisible(true);
				if (Tela.botao == true) {
					face.setVisible(false);
					face.dispose();
					inicial.setVisible(true);
					Tela.botao = false;
					Inicial.menuCadastro = false;
				}
			} else if (Inicial.menuProduto == true) {
				inicial.dispose();
				primeira.setVisible(true);
				int i = 0;
				if (PrimeiraProduto.botaoPesquisa == true) {
					int flag = 0;
					for (i = 0; i < Tela.listaItens.size(); i++) {
						if (Tela.listaItens.get(i).getNome().equals(PrimeiraProduto.getPesquisa())
								|| Tela.listaItens.get(i).getFabricante().equals(PrimeiraProduto.getPesquisa())) {
							flag = 1;
						}
					}
					if (flag != 1) {
						primeira.dispose();
						quarto.setVisible(true);
						Thread.sleep(5000);
						System.exit(0);

					} else {
						primeira.setVisible(false);
						primeira.dispose();
						segunda.setVisible(true);
					}
				}
				if (SegundoProduto.botaoPedido == true) {
					segunda.setVisible(false);
					segunda.dispose();
					terceira.setVisible(true);
				}
				if (TerceiroProduto.quantityBotao == true) {
					terceira.setVisible(false);
					terceira.dispose();
					int quantidade = Tela.listaItens.get(0).getQuantidade();
					quantidade = quantidade - 1;
					Tela.listaItens.get(0).setQuantidade(quantidade);
					PrimeiraProduto.botaoPesquisa = false;
					SegundoProduto.botaoPedido = false;
					TerceiroProduto.quantityBotao = false;
					condicao = false;
					System.exit(0);
				}
			}

		}
	}
	
	
	
	

}
