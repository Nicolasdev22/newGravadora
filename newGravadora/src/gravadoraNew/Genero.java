package gravadoraNew;

import java.util.ArrayList;

public class Genero {

	int id;
	String nome;
	String descricao;
	Musica musica;
	
	ArrayList<Musica> musicas = new ArrayList<Musica>();
	
	void adicionarMusicas(Musica musica) {
		this.musicas.add(musica);
	}
}
