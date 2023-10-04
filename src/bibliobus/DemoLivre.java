package bibliobus;

public class DemoLivre {

	public static void main(String[] args) {
		
		Livre l1 = new Livre("L'étranger","Albert Camus","Editions Gallimard", GenreLivre.LITTERATURE, "theBus");
		Livre l2 = new Livre("Voyage au bout de la nuit","Louis-Ferdinand Céline","Editions Denoel et Steele", GenreLivre.LITTERATURE, "theBus");
		Livre l3 = new Livre("Le petit prince","Antoine de Saint-Exupéry","Editions Gallimard", GenreLivre.LITTERATURE, "theBus");
		Livre l4 = new Livre("L'étranger","Albert Camus","Editions Gallimard", GenreLivre.POLICIER, "theBus");
		
		l1.nouvelExemplaire();
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(l3.toString());
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l4));
		System.out.println(l4.nouvelEditeur("Editions pied de nez"));
	}

}
