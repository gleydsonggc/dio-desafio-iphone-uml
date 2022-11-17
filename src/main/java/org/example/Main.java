package org.example;

public class Main {

	public static void main(String[] args) {
		var iphone = new Iphone();
		iphone.adicionarNovaAba();
		iphone.exibirPagina("https://google.com");
		iphone.atualizarPagina();
		iphone.selecionarMusica("Hino Nacional Brasileiro");
		iphone.tocar();
		iphone.pausar();
		iphone.ligar("+551122223333");
		iphone.atender();
		iphone.iniciarCorreioVoz();
	}

}