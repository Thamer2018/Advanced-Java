
public class CartesPays extends CartesGeographiques {

	private int nbrProvince;
	private String nomProvince[];

	public CartesPays() {

		super();
		nbrProvince = 0;
		nomProvince = new String[30];

	}

	public CartesPays(int prix, double hauteur, double largeur, int numEmplacement, String compagnieDist,
			String nomCarte, String superficie, int NbrProvince, String NomProvince[]) {

		super(prix, hauteur, largeur, numEmplacement, compagnieDist, nomCarte, superficie);
		this.nbrProvince = nbrProvince;
		this.nomProvince[30] = nomProvince[30];
	}

}
