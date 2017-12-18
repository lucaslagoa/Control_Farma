package model;

public class Pedido {
	
	
	public Pedido(Produto p, int quantidadeProduto){
		
		new ItemPedido(quantidadeProduto, p.getPreco());
		
	}
	

}
