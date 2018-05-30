
public class Cartesajouer extends Cartes {

	private String nomJeu;
	private String couleur;

	public Cartesajouer() {

		super();
		nomJeu = "Inconnu";
		couleur = "Inconnu";

	}

	public Cartesajouer(int prix, double hauteur, double largeur, int numEmplacement, String compagnieDist,
			String categorie, String texte) {

		super(prix, hauteur, largeur, numEmplacement, compagnieDist);
		this.nomJeu = categorie;
		this.couleur = texte;
	}

}
