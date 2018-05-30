
public class Cercle implements InterfaceForme {

	////////////////////// Attributs /////////////////////

	private Point2D centre;

	private double rayon;

	// Constricteur par défaut
	public Cercle() {

		Point2D centre = new Point2D();
		rayon = 0;

	}

	// Constructeur par passage de parametres
	public Cercle(double x, double y) {

		Point2D centre = new Point2D(x, y);
		this.rayon = rayon;

	}

	// Constructeur par copie d'objet
	public Cercle(Point2D centre) {

		Cercle cercle = new Cercle(centre);
		this.rayon = rayon;

	}

	///////////////// Accesseurs /////////////////////

	public double getX() {

		return centre.getX();
	}

	public double getY() {

		return centre.getY();
	}

	public double getRayon() {

		return rayon;
	}

	///////////////// Mutateurs /////////////////////

	public void setX(double x) {

		centre.setX(x);

	}

	public void setY(double y) {

		centre.setY(y);

	}

	public void setRayon(double rayon) {

		this.rayon = rayon;
	}

	public double getSuperficie() {

		return 3.14 * rayon * rayon;
	}

	public double getPerimetre() {

		return 2 * 3.14 * rayon;

	}

	public String toString() {

		return "Cercle de position" + centre.getX() + "," + centre.getY() + ", et de rayon " + rayon;
	}

}
