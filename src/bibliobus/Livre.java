package bibliobus;

public class Livre {

	private String titre;
	
	private String auteur;
	
	private String editeur;
	
	private int nbExemplaires = 1;	
	
	private Genre genre = Genre.NON_SPECIFIE;
	
	public Livre(String titre, String auteur, String editeur) {
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
	}
	
	public Livre(String titre, String auteur, String editeur, Genre genre) {
		this.titre = titre;
		this.auteur = auteur;
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

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public void nouvelExemplaire() {		
		nbExemplaires++;	
	}
	
	public void nouvelExemplaire(int nb) {
		if(nb > 0) {
			nbExemplaires += nb;
		}
	}

	public void perteExemplaire() {
		if(nbExemplaires > 0) {
			nbExemplaires--;
		}
	}
	
	public boolean estPresent() {
		return nbExemplaires > 0;
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
		return new Livre(titre, auteur, unEditeur, genre);
	}
}
