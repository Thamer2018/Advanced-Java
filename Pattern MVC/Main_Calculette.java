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
		// Instanciation de notre mod�le
		AbstractModel calc = new Calculator();
		// Cr�ation du contr�leur
		AbstractControler controler = new CalculetteControler(calc);
		// Cr�ation de notre fen�tre avec le contr�leur en param�tre
		Calculette calculette = new Calculette(controler);
		// Ajout de la fen�tre comme observer de notre mod�le
		calc.addObserver(calculette);
	}
}