package bibliobus;

public class DemoBiblioBus {

	public static void main(String[] args) {
		
		BiblioBus bibliobus = new BiblioBus("theBus",5);
				
		bibliobus.afficheCatalogue();
		
		bibliobus.ajoutLivre("titre", "auteur", "editeur","theBus");	
			
		bibliobus.afficheCatalogue();
				
		bibliobus.ajoutLivre("titre", "auteur", "editeur","theBus");
		bibliobus.ajoutLivre("titre", "auteur", "editeur","theBus");
		bibliobus.ajoutLivre("titre2", "auteur", "editeur", GenreLivre.BANDE_DESSINEE,"theBus");			
		
		bibliobus.afficheCatalogue();
		
		System.out.println(bibliobus.getNbExemplaires("auteur"));
		System.out.println(bibliobus.getNbExemplaires(GenreLivre.NON_SPECIFIE));
		System.out.println(bibliobus.getNbExemplaires(GenreLivre.BANDE_DESSINEE));
		
		System.out.println("-- livres de 'auteur' --");
		int[] livresIdsAuteur = bibliobus.getLivresDeAuteur("auteur");
		for(int i=0; i<livresIdsAuteur.length; i++) {
			System.out.println(livresIdsAuteur[i]);
		}
		
		bibliobus.ajoutDisque("disque1", "auteurD1","theBus");
		bibliobus.ajoutDisque("disque1", "auteurD1","theBus");
		bibliobus.ajoutDisque("disque2", "auteurD2","theBus");
		
		bibliobus.afficheCatalogue();
	}

}
