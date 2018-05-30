
public class CartesSouhait extends Cartes {

	private String categorie;
	private String texte;

	public CartesSouhait() {

		super();
		String categorie = "Inconnu";
		String texte = "Inconnu";

	}

	public CartesSouhait(int prix, double hauteur, double largeur, int numEmplacement, String compagnieDist,
			String categorie, String texte) {

		super(prix, hauteur, largeur, numEmplacement, compagnieDist);
		this.categorie = categorie;
		this.texte = texte;
	}

}
