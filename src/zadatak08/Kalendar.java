package zadatak08;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Kalendar {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		int mjesec;
		
		String[] dani = {"P", "U", "S", "Č", "P", "S", "N"};
		
		do {
			mjesec = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj mjeseca u godini:"));
			if(mjesec < 1 || mjesec > 12) {
				JOptionPane.showMessageDialog(f, "Unijeli ste ne postojeci mjesec! Pokusajte ponovno.");
			}			
			
		}while(mjesec < 1 || mjesec > 12);
		
		for(int i = 0; i < dani.length; i++) {
			System.out.format("%3s", dani[i]);
		}	
		System.out.println();
		
		if(mjesec == 1 || mjesec == 3 || mjesec == 5 || mjesec == 7 || mjesec == 8 || mjesec == 10 || mjesec == 12) {
			int min = 1;
			int max = 31;
			for(int i = min; i <= max; i++) {
				if(i == 8) {
					System.out.println();
				}
				else if(i == 15) {
					System.out.println();
				}
				else if(i == 22) {
					System.out.println();
				}
				else if(i == 29) {
					System.out.println();
				}
				System.out.format("%3s", i);
			}
		}
		else if(mjesec == 4 || mjesec == 6 || mjesec == 9 || mjesec == 11) {
			int min = 1;
			int max = 30;
			for(int i = min; i <= max; i++) {
				if(i == 8) {
					System.out.println();
				}
				else if(i == 15) {
					System.out.println();
				}
				else if(i == 22) {
					System.out.println();
				}
				else if(i == 29) {
					System.out.println();
				}
				System.out.format("%3s", i);
			}
			
		}
		else {
			int min = 1;
			int max = 29;
			for(int i = min; i <= max; i++) {
				if(i == 8) {
					System.out.println();
				}
				else if(i == 15) {
					System.out.println();
				}
				else if(i == 22) {
					System.out.println();
				}
				else if(i == 29) {
					System.out.println();
				}
				System.out.format("%3s", i);
			}
		}
	}

}
