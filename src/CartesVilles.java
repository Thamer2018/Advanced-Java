
public class CartesVilles extends CartesGeographiques {

	private int nbrDistrict;
	private String nomDistrict[];

	public CartesVilles() {

		super();
		nbrDistrict = 0;
		nomDistrict = new String[30];

	}

	public CartesVilles(int prix, double hauteur, double largeur, int numEmplacement, String compagnieDist,
			String nomCarte, String superficie, int nbrDistrict, String nomDistrict[]) {

		super(prix, hauteur, largeur, numEmplacement, compagnieDist, nomCarte, superficie);
		this.nbrDistrict = nbrDistrict;
		this.nomDistrict[30] = nomDistrict[30];
	}

}
