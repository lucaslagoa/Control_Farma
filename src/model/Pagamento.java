package model;

import java.util.Scanner;

public class Pagamento {
	
	
	public void Pagar(float preco){
		
		System.out.println("Digite a forma de pagamento: ");
		Scanner ler = new Scanner(System.in);
		String opcao = ler.nextLine();
		opcao= opcao.toLowerCase();
		
		if(opcao.equals("dinheiro")){
			Dinheiro dinheiro = new Dinheiro();
			preco = dinheiro.calcularDesconto(preco);
			System.out.println("O preço total do pedido é: "+ preco);
			
		}else if(opcao.equals("cartao")){
			int numero;
			String nome;
			int senha;
			String validade1;
			boolean valido  = false;
			
			System.out.println("Digite o nome do usuário: ");
			ler = new Scanner(System.in);
			nome = ler.nextLine();
			System.out.println("Digite a validade do cartão do usuário: ");
			ler = new Scanner(System.in);
			validade1 = ler.nextLine();
			if(validade1.equals("True"))
				valido = true;
			else
				valido = false;
	
			System.out.println("Digite o número do cartão do usuário: ");
			ler = new Scanner(System.in);
			numero = Integer.parseInt(ler.nextLine());
			System.out.println("Digite a senha do cartão do usuário: ");
			ler = new Scanner(System.in);
			senha = Integer.parseInt(ler.nextLine());
			
			Cartao cartao = new Cartao(numero, valido,nome, senha);
			
			cartao.getValidade();
			
		}
		else{
			System.out.println("A opção digitada é inválida ! ");
		}
		
		
	}

}
