package zadatak04;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ParanNeparan {
	public static void main(String[] args) {
		int[] brojevi = {5, 12, 43, 71, 88};
		JFrame f = new JFrame();
		for(int i = 0; i < 5; i++) {
			if(brojevi[i] % 2 == 0) {
				JOptionPane.showMessageDialog(f, "Broj " + brojevi[i] + " je paran!");
				
				if(brojevi[i] % 3 == 0) {
					JOptionPane.showMessageDialog(f, "Broj " + brojevi[i] + " je višekratnik broja 3!");
				}
				else if(brojevi[i] % 5 == 0) {
					JOptionPane.showMessageDialog(f, "Broj " + brojevi[i] + " je višekratnik broja 5!");
				}
				else if(brojevi[i] % 11 == 0){
					JOptionPane.showMessageDialog(f, "Broj " + brojevi[i] + " je višekratnik broja 11!");
				}
			}
			else if(brojevi[i] % 2 != 0) {
				JOptionPane.showMessageDialog(f, "Broj " + brojevi[i] + " je neparan!");
				
				if(brojevi[i] % 3 == 0) {
					JOptionPane.showMessageDialog(f, "Broj " + brojevi[i] + " je višekratnik broja 3!");
				}
				else if(brojevi[i] % 5 == 0) {
					JOptionPane.showMessageDialog(f, "Broj " + brojevi[i] + " je višekratnik broja 5!");
				}
				else if(brojevi[i] % 11 == 0){
					JOptionPane.showMessageDialog(f, "Broj " + brojevi[i] + " je višekratnik broja 11!");
				}
			}
		}
			
	}
}
