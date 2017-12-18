package model;

public class ItemPedido {
	
	
	public int quantidade;
	public float preco;
	
	public ItemPedido(int quantidade, float preco){
		
		this.quantidade = quantidade;
		this.preco = calculaPreco(preco, quantidade);
		
		Pagamento pagamento = new Pagamento();
		pagamento.Pagar(this.preco);
		
		
	}
	public float calculaPreco(float preco, int quantidade){

		return preco*quantidade;
		
		
	}

}
