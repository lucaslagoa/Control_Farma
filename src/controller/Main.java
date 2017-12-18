package controller;

import java.io.IOException;

import model.Atendente;

public class Main {

	static Atendente atendente = new Atendente();

	public static void main(String[] args) throws IOException, InterruptedException {
		atendente.fazPedido();
	}

}
