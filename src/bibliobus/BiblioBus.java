package bibliobus;

public class BiblioBus {

	private String nom;
	private Media[] medias;
	
	public BiblioBus(String nom) {
		this.nom = nom;
		this.medias = new Livre[100];
	}
	public BiblioBus(String nom,int tailleCatalogue) {
		this.nom = nom;
		this.medias = new Media[tailleCatalogue];
	}
	
	
	
	public boolean estPresent(String titre, String auteur) {
		
		for(int i=0; i<getNbMedias(); i++) {
			if(medias[i].getTitre().equalsIgnoreCase(titre)
					&& medias[i].getAuteur().equalsIgnoreCase(auteur)) {
				return true;
			}			
		}
		return false;
	}
	
	public boolean estPresent(String titre, String auteur, String editeur) {
		
		for(int i=0; i<getNbMedias(); i++) {
			if(medias[i].getTitre().equalsIgnoreCase(titre)
					&& medias[i].getAuteur().equalsIgnoreCase(auteur)
					&& ((Livre)medias[i]).getEditeur().equalsIgnoreCase(editeur)) {
				return true;
			}			
		}
		return false;
	}
	
	public void ajouterExemplaire(String titre, String auteur, String editeur) {
		for(int i=0; i<getNbMedias(); i++) {
			if(medias[i].getTitre().equalsIgnoreCase(titre)
					&& medias[i].getAuteur().equalsIgnoreCase(auteur)
					&& ((Livre)medias[i]).getEditeur().equalsIgnoreCase(editeur)) {
				medias[i].nouvelExemplaire();
				System.out.println("Ajout d'un exemplaire du livre : "+titre+" par "+auteur+" édité par "+editeur);
			}			
		}
	}
	
	public void ajoutLivre(String titre, String auteur, String editeur, String bibliobus) {
		
		if(!estPresent(titre, auteur, editeur)) {
			// trouver la prochaine place
			int i = 0;
			while(i < medias.length && medias[i] != null) {
				i++;
			}
			// si une place libre
			if(i < medias.length) {
				// ajout du livre
				medias[i] = new Livre(titre, auteur, editeur, bibliobus);
				System.out.println("Ajout du livre : "+titre+" par "+auteur+" édité par "+editeur);
			}else {
				System.out.println("Le bibliobus "+nom+" de taille "+medias.length+" est complet.");
			}
		}else {
			ajouterExemplaire(titre, auteur, editeur);
		}
		
	}
	
	public void ajoutLivre(String titre, String auteur, String editeur, GenreLivre genre, String bibliobus) {
		
		if(!estPresent(titre, auteur, editeur)) {
			// trouver la prochaine place
			int i = 0;
			while(i < medias.length && medias[i] != null) {
				i++;
			}
			// si une place libre
			if(i < medias.length) {
				// ajout du livre
				medias[i] = new Livre(titre, auteur, editeur, genre, bibliobus);
				System.out.println("Ajout du livre : "+titre+" par "+auteur+" édité par "+editeur+" du genre "+genre);
			}else {
				System.out.println("Le bibliobus "+nom+" de taille "+medias.length+" est complet.");
			}
		}else {
			ajouterExemplaire(titre, auteur, editeur);
		}
		
	}
	
	public int getNbMedias() {
		int nbMedias = 0;
		for(int i=0; i<medias.length; i++) {
			if(medias[i] != null) {
				nbMedias++;
			}
		}
		return nbMedias;
	}
	
	public void afficheCatalogue() {
		System.out.println("-------------------------------------------------");
		System.out.println("le bibliobus "+nom+" a pour catalogue : ");
		for(int i=0; i<medias.length; i++) {
			if(medias[i] != null) {
				System.out.println(medias[i].toString());				
			}
		}
		System.out.println("-------------------------------------------------");
	}
	
	public String getTitre(int identifiant) {
		
		if(identifiant < medias.length) {
			return medias[identifiant].getTitre();
		}else {
			System.out.println("L'identifiant indiqué n'est pas correct.");
			return "";
		}
		
	}

	public int getNbExemplaires(int identifiant) {
		
		if(identifiant < medias.length) {
			return medias[identifiant].getNbExemplaires();
		}else {
			System.out.println("L'identifiant indiqué n'est pas correct.");
			return -1;
		}
		
	}

	public int getNbExemplaires(String auteur) {
		
		int nbExemplaire = 0;
		for(int i=0; i<getNbMedias(); i++) {
			if(medias[i].getAuteur().equalsIgnoreCase(auteur)) {
				nbExemplaire += medias[i].getNbExemplaires();
			}			
		}
		return nbExemplaire;
	}
	
	public int getNbExemplaires(GenreLivre genre) {
		
		int nbExemplaire = 0;
		for(int i=0; i<getNbMedias(); i++) {
			if(((Livre)medias[i]).getGenre().equals(genre)) {
				nbExemplaire += medias[i].getNbExemplaires();
			}			
		}
		return nbExemplaire;
	}

	public int nbLivresDeAuteur(String auteur) {
		int nb = 0;
		for(int i=0; i<getNbMedias(); i++) {
			if(medias[i].getAuteur().equalsIgnoreCase(auteur)) {
				nb++;
			}
		}
		return nb;
	}
	
	public int[] getLivresDeAuteur(String auteur) {
		
		int[] res = new int[nbLivresDeAuteur(auteur)];
		int indRes = 0;
		
		for(int i=0; i<getNbMedias(); i++) {
			if(medias[i].getAuteur().equalsIgnoreCase(auteur)) {
				res[indRes] = i;
				indRes++;
			}
		}
		return res;
	}
}
