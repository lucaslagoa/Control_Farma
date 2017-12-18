package model;

public class Dinheiro extends Pagamento{
	
	public float calcularDesconto(float preco){
		//ganha 10% de desconto avista
		return (float) (preco - preco*0.1);
		
	}

}
