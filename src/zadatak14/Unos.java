package zadatak14;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Unos extends Izracun{
	public static void main(String [] args) {
		JFrame f = new JFrame();
		int T1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite početnu točku za krivulju: "));
		int T2 = 0;
		boolean a = true;
		while(a) {
			T2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite krajnju točku za krivulju: "));
			if(T2 < T1) {
				JOptionPane.showMessageDialog(f, "Krajnja točka mora biti veća od početne, ponovite unos.");
			}else {
				a = false;
			}
		}
		
		int A = Integer.parseInt(JOptionPane.showInputDialog("Unesite vrijednost za varijablu A: "));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Unesite vrijednost za varijablu B: "));
		
		int odabir = odabirFunkcije();
		
		izracunFunckije(odabir, A, B, T1 , T2);
		
		
		
	}
}
