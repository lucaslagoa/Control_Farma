package model;

import java.io.IOException;
import java.util.ArrayList;

public class Produto {
	
	private String nome;
	private String principioAtivo;
	private int lote;
	private String fabricante;
	private float preco;
	private int quantidade;
	private boolean confirmacao;
	
	
	public Produto(String nome, String principioAtivo, int lote, String fabricante, float preco, int quantidade) {

		this.nome = nome;
		this.principioAtivo = principioAtivo;
		this.lote = lote; 
		this.fabricante = fabricante;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPrincipioAtivo() {
		return principioAtivo;
	}

	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public boolean imprime() throws IOException {

		System.out.println("Nome: " + getNome() + "\n" + "Princípio Ativo: " + getPrincipioAtivo() + "\n" + 
		"Lote: " + getLote() + "\n" + "Fabricante: " + getFabricante() + "\n" + "Preço: " + getPreco() + "\n" + "Quantidade: " + getQuantidade());
		confirmacao = true;
		return confirmacao;
	}	

}
