import com.sdz.controler.AbstractControler;
import com.sdz.controler.CalculetteControler;
import com.sdz.model.AbstractModel;
import com.sdz.model.Calculator;
import com.sdz.vue.Calculette;

/**
 * @author thame
 *
 */
public class Main_Calculette {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instanciation de notre modèle
		AbstractModel calc = new Calculator();
		// Création du contrôleur
		AbstractControler controler = new CalculetteControler(calc);
		// Création de notre fenêtre avec le contrôleur en paramètre
		Calculette calculette = new Calculette(controler);
		// Ajout de la fenêtre comme observer de notre modèle
		calc.addObserver(calculette);
	}
}