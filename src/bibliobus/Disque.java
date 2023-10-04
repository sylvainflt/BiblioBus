package bibliobus;

public class Disque extends Media{

	private GenreDisque genre = GenreDisque.NON_SPECIFIE;	
	
	private String[] pistes;
	
	public Disque(String titre, String auteur, String bibliobus) {
		super(titre, auteur, bibliobus);		
	}
	
	public Disque(String titre, String auteur, String bibliobus, GenreDisque genre) {
		super(titre, auteur, bibliobus);	
		this.genre = genre;
	}

	public String[] getPistes() {
		return pistes;
	}

	public void setPistes(String[] pistes) {
		this.pistes = pistes;
	}

	public GenreDisque getGenre() {
		return genre;
	}

	public void setGenre(GenreDisque genre) {
		this.genre = genre;
	}
	
	public String toString() {
		return
				"le disque : "+super.getTitre()+", écrit par "+super.getAuteur()+
				" appartenant au genre "+genre+ " est présent en "+super.getNbExemplaires()+" exemplaire(s)";
	}
}
