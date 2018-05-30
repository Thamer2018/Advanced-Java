
public class CartesProvinces extends CartesGeographiques {

	private int nbrVilles;
	private String nomVilles[];

	public CartesProvinces() {

		super();
		nbrVilles = 0;
		nomVilles = new String[30];

	}

	public CartesProvinces(int prix, double hauteur, double largeur, int numEmplacement, String compagnieDist,
			String nomCarte, String superficie, int nbrVilles, String nomVilles[]) {

		super(prix, hauteur, largeur, numEmplacement, compagnieDist, nomCarte, superficie);
		this.nbrVilles = nbrVilles;
		this.nomVilles[30] = nomVilles[30];
	}

}
