package gravadoraNew;

import java.util.ArrayList;

public class Gravadora {

	int id;
	String nome;
	int anoDeInauguracao;
	String descricao;
	Musica musica;


	ArrayList<Musica> musicas = new ArrayList<Musica>();

	void adicionarMusica(Musica musica) {
		this.musicas.add(musica);

	}
	

}
