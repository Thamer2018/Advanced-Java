
public class CartesDistricts extends CartesGeographiques {

	private int nbrHabitants;

	public CartesDistricts() {

		super();
		nbrHabitants = 0;

	}

	public CartesDistricts(int prix, double hauteur, double largeur, int numEmplacement, String compagnieDist,
			String nomCarte, String superficie, int nbrHabitants) {

		super(prix, hauteur, largeur, numEmplacement, compagnieDist, nomCarte, superficie);
		this.nbrHabitants = nbrHabitants;

	}

}
