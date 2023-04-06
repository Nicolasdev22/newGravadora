package gravadoraNew;

public class TestaAutor {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor();
		autor1.adicionarMusicasDoAutor("fronteiras", "radio mania");
		
		System.out.println(autor1.musicas.size());

	}

}
