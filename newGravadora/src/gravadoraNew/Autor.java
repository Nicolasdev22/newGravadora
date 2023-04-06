package gravadoraNew;

import java.util.ArrayList;

public class Autor {
	
	int id;
	String nome;
	Musica musica;
	Gravadora gravadora;
	
	ArrayList<Musica> musicas = new ArrayList<>();
	
	void adicionarMusicasDoAutor(String nome, String gravadora) {
		this.adicionarMusicasDoAutor(new Musica(nome)); 
	}
	
	void adicionarMusicasDoAutor(Musica musica) {
		this.musicas.add(musica);
		
	}

}
