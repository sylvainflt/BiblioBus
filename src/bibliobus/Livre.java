package bibliobus;

public class Livre extends Media{
	
	private String editeur;
			
	private GenreLivre genre = GenreLivre.NON_SPECIFIE;	
	
	public Livre(String titre, String auteur, String editeur, String bibliobus) {
		super(titre, auteur, bibliobus);
		this.editeur = editeur;
		
	}
	
	public Livre(String titre, String auteur, String editeur, GenreLivre genre, String bibliobus) {
		super(titre, auteur, bibliobus);
		this.editeur = editeur;
		this.genre = genre;		
	}
	
	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public GenreLivre getGenre() {
		return genre;
	}

	public void setGenre(GenreLivre genre) {
		this.genre = genre;
	}

	public int getNbExemplaires() {
		return super.getNbExemplaires();
	}		
	
	public String toString() {
		return
				"le livre : "+titre+", écrit par "+auteur+" et édité par "+editeur+
				" appartenant au genre "+genre+ " est présent en "+nbExemplaires+" exemplaire(s)";
	}
	
	public boolean equals(Livre l) {
		if(l.getTitre().equalsIgnoreCase(this.getTitre())
			&& l.getAuteur().equalsIgnoreCase(this.getAuteur())
			&& l.getEditeur().equalsIgnoreCase(this.getEditeur())) return true;
		else return false;
	}
	
	public Livre nouvelEditeur(String unEditeur) {
		return new Livre(super.getTitre(), super.getAuteur(), unEditeur, genre, "theBus");
	}
}
