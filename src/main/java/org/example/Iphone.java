package org.example;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	private String paginaWeb;

	private String musica;

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba...");
	}

	@Override
	public void exibirPagina(String paginaWeb) {
		System.out.println("Exibindo a página: " + paginaWeb);
		this.paginaWeb = paginaWeb;
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página: " + this.paginaWeb);
	}

	@Override
	public void tocar() {
		System.out.println("Tocando a música: " + this.musica);
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a música: " + this.musica);
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a música: " + musica);
		this.musica = musica;
	}

	@Override
	public void ligar(String telefone) {
		System.out.println("Ligando para o número: " + telefone);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada...");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
	}

}