package bibliobus;

public class DemoBiblioBus {

	public static void main(String[] args) {
		
		BiblioBus bibliobus = new BiblioBus("theBus",1);
		
		System.out.println(bibliobus.getNbLivres());
		bibliobus.afficheCatalogue();;
		
		bibliobus.ajoutLivre("titre", "auteur", "editeur");	
		
		System.out.println(bibliobus.getNbLivres());
		bibliobus.afficheCatalogue();
		
		bibliobus.ajoutLivre("titre2", "auteur2", "editeur2");

		System.out.println(bibliobus.getTitre(0));
		System.out.println(bibliobus.getTitre(1));
	}

}
