
public class Cartes {

	// un prix de vente, une hauteur,
	// une largeur, un numéro d’emplacement dans le magasin et une compagnie qui les
	// distribue.

	protected int prix;
	protected double hauteur;
	protected double largeur;
	protected int numEmplacement;
	protected String compagnieDist;

	public Cartes() {

		prix = 0;
		hauteur = 0;
		largeur = 0;
		numEmplacement = 0;
		compagnieDist = "Inconnu";

	}

	public Cartes(int prix, double hauteur, double largeur, int numEmplacement, String compagnieDist) {

		this.prix = prix;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.numEmplacement = numEmplacement;
		this.compagnieDist = compagnieDist;

	}
}
