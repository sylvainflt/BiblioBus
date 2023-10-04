package bibliobus;

public class BiblioBus {

	private String nom;
	private Livre[] livres;
	
	public BiblioBus(String nom) {
		this.nom = nom;
		this.livres = new Livre[100];
	}
	public BiblioBus(String nom,int tailleCatalogue) {
		this.nom = nom;
		this.livres = new Livre[tailleCatalogue];
	}
	
	public void ajoutLivre(String titre, String auteur, String editeur) {
		// trouver la prochaine place
		int i = 0;
		while(i < livres.length && livres[i] != null) {
			i++;
		}
		// si une place libre
		if(i < livres.length) {
			// ajout du livre
			livres[i] = new Livre(titre, auteur, editeur);
			System.out.println("Ajout du livre : "+titre);
		}else {
			System.out.println("Le bibliobus "+nom+" de taille "+livres.length+" est complet.");
		}
	}
	
	public int getNbLivres() {
		int nbLivres = 0;
		for(int i=0; i<livres.length; i++) {
			if(livres[i] != null) {
				nbLivres++;
			}
		}
		return nbLivres;
	}
	
	public void afficheCatalogue() {
		System.out.println("-------------------------------------------------");
		System.out.println("le bibliobus "+nom+" a pour catalogue : ");
		for(int i=0; i<livres.length; i++) {
			if(livres[i] != null) {
				System.out.println(livres[i].toString());				
			}
		}
		System.out.println("-------------------------------------------------");
	}
	
	public String getTitre(int identifiant) {
		
		if(identifiant < livres.length) {
			return livres[identifiant].getTitre();
		}else {
			System.out.println("L'identifiant indiqué n'est pas correct.");
			return "";
		}
		
	}
}
