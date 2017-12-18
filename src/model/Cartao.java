package model;

public class Cartao extends Pagamento{
	
	public int numero;
	public int validade;
	public String nome;
	public int senha;
	public boolean valido = false;
	
	
	public Cartao(int numero, boolean validade, String nome, int senha){
		
		this.numero = numero;
		this.nome = nome;
		this.senha = senha;
		this.valido = true;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getValidade() {
		return validade;
	}
	public void setValidade(int validade) {
		this.validade = validade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public boolean isValido() {
		return valido;
	}
	public void setValido(boolean valido) {
		this.valido = valido;
	}
	
	
	

}
