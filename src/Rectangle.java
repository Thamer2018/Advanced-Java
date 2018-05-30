
public class Rectangle implements InterfaceForme {

	////////////////////// Attributs /////////////////////

	private Point2D centre;
	double largeur;
	double hauteur;

	public Rectangle() {// par défaut

		Point2D centre;
		largeur = 0;
		hauteur = 0;
	}

	public Rectangle(double hauteur, double largeur, double x, double y) {

		Point2D centre = new Point2D(x, y);
		this.hauteur = hauteur;
		this.largeur = largeur;

	}

	public Rectangle(Point2D centre) {

		Rectangle rectangle = new Rectangle(centre);
		this.hauteur = hauteur;
		this.largeur = largeur;

	}

	///////////////// Accesseurs /////////////////////

	public double getX() {

		return centre.getX();
	}

	public double getY() {

		return centre.getY();
	}

	public double getLargeur() {

		return largeur;
	}

	public double hauteur() {

		return hauteur;
	}

	///////////////// Mutateurs /////////////////////

	public void setX(double x) {

		centre.setX(x);
	}

	public void setY(double y) {

		centre.setY(y);
	}

	public void setLargeur(double largeur) {

		this.largeur = largeur;
	}

	public void setHauteur(double hauteur) {

		this.hauteur = hauteur;
	}

	public double getSuperficie() {

		return hauteur * largeur;
	}

	public double getPerimetre() {

		return 2 * (hauteur + largeur);

	}

	public String toString() {

		return "Rectangle de position" + centre.getX() + "," + centre.getY() + ", de largeur " + largeur
				+ "et d'hauteur " + hauteur;
	}

}
