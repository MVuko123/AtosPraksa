package zadatak07;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DjeljiviS6 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		int max = Integer.parseInt(JOptionPane.showInputDialog("Unesite gornju granicu intervala"));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Unesite donju granicu intervala"));
		
		int[] randomBrojevi = new int [(max-min)];
		for(int i = 0; i < randomBrojevi.length; i++) {
		
			randomBrojevi[i] = (int) ((Math.random() * (max - min)) + min);			 
		}
		
		/*for(int j = 0; j < randomBrojevi.length; j++) {
		System.out.println(randomBrojevi[j]);
		}*/
		
		int brojac = 0;
		
		for(int i = 0; i < randomBrojevi.length; i++) {
			if(randomBrojevi[i] % 6 == 0) {
				brojac++;
			}
		}
		
		JOptionPane.showMessageDialog(f, "Vrijednost brojaca je: " + brojac);
		
	}
}
