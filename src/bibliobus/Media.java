package bibliobus;

public class Media {

	protected String titre;
	
	protected String auteur;
	
	protected int nbExemplaires = 1;	
	
	protected String bibliobus;
	
	public Media(String titre, String auteur, String bibliobus) {
		this.titre = titre;
		this.auteur = auteur;
		this.bibliobus = bibliobus;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbExemplaires() {
		return nbExemplaires;
	}

	public void setNbExemplaires(int nbExemplaires) {
		this.nbExemplaires = nbExemplaires;
	}

	public String getBibliobus() {
		return bibliobus;
	}

	public void setBibliobus(String bibliobus) {
		this.bibliobus = bibliobus;
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
		return getNbExemplaires() > 0;
	}
	
	public String toString() {
		return
				"le media : "+titre+", écrit par "+auteur+
				" est présent en "+nbExemplaires+" exemplaire(s)";
	}
	
	public boolean equals(Media m) {
		if(m.getTitre().equalsIgnoreCase(this.getTitre())
			&& m.getAuteur().equalsIgnoreCase(this.getAuteur())) return true;
		else return false;
	}
	
}
