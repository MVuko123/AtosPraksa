package zadatak13;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pas implements Zivotinje {
	JFrame f = new JFrame();
	
	@Override
	public void pasmina(String pasmina) {
		JOptionPane.showMessageDialog(f, "Vrsta psa je: " + pasmina);
		
	}

	@Override
	public void dob(Integer dob) {
		JOptionPane.showMessageDialog(f, "Pas ime: " + dob + ". godina");
		
	}

	@Override
	public void boja(String boja) {
		JOptionPane.showMessageDialog(f, "Pas je: " + boja + " boje");
		
	}
	
	@Override
	public void ime(String ime) {
		JOptionPane.showMessageDialog(f, "Ime psa je :" + ime);
		
	}
	
	public static void main(String[] args) {
		Pas pas = new Pas();
		
		JFrame f = new JFrame();
 		String pasmina = JOptionPane.showInputDialog(f, "Koje vrste je vaš pas? ");
		int dob = Integer.parseInt(JOptionPane.showInputDialog("Koliko godina ima vaš pas?"));
 		String boja = JOptionPane.showInputDialog(f, "Koje je boje vaš pas? ");
 		String ime = JOptionPane.showInputDialog(f, "Kako se zove vaš pas? ");
 		
 		pas.pasmina(pasmina);
 		pas.dob(dob);
 		pas.boja(boja);
 		pas.ime(ime);
 		
	}


	
	
}
