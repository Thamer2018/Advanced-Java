import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author thame
 *
 */
public class Fenetre extends JFrame {
	private Panneau pan = new Panneau();
	private JButton bouton = new JButton("Go");
	private JButton bouton2 = new JButton("Stop");
	private JPanel container = new JPanel();
	private JLabel label = new JLabel("Le JLabel");
	private int compteur = 0;
	private boolean animated = true;
	private boolean backX, backY;
	private int x, y;
	private Thread t;

	/**
	 * 
	 */
	public Fenetre() {
		// Le constructeur n'a pas chang�
	}

	private void go() {
		// La m�thode n'a pas chang�
	}

	/**
	 * @author thame
	 *
	 */
	public class BoutonListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			animated = true;
			t = new Thread(new PlayAnimation());
			t.start();
			bouton.setEnabled(false);
			bouton2.setEnabled(true);
		}
	}

	class Bouton2Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			animated = false;
			bouton.setEnabled(true);
			bouton2.setEnabled(false);
		}
	}

	class PlayAnimation implements Runnable {
		public void run() {
			go();
		}
	}
}