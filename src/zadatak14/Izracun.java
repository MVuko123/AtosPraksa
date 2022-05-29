package zadatak14;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Izracun implements Metode{



	
	static int odabirFunkcije() {
			JFrame f = new JFrame();
			int funkcija = Integer.parseInt(JOptionPane.showInputDialog("Odaberite kojom funkcijom će se računati površina ispod krivulja: \n 1.SIN \n 2.COS \n 3.TAN \n 4.CON"));								
			return funkcija;
	}
	
	static void izracunFunckije(int funkcija, int A, int B, int T1, int T2) {
		
		JFrame f = new JFrame();
		double rezultat = 5;
		String funk = "";
		
		switch(funkcija) {
		case 1:
			funk = "sin";
			rezultat = A*Math.sin(T2 - T1)+B;
			break;
		case 2:
			funk = "cos";
			rezultat = A*Math.cos(T2 - T1)+B;
			break;
		case 3:
			funk = "tan";
			rezultat = (A*Math.sin(T2)+B) / (A*Math.cos(T1) + B);
			break;
		case 4:
			funk = "con";
			rezultat = (A*Math.cos(T2)+B) / (A*Math.sin(T1) + B);
			break;
		default:
			JOptionPane.showMessageDialog(f, "Unijeli ste broj koji ne predstavlja funkciju, program će se ugasiti.");
			System.exit(1);
		}
		
		JOptionPane.showMessageDialog(f, "Odbarali ste " + funk.toUpperCase() + " funckiju za izračun površine ispod krivulja koja se proteže od " + T1 + " do " + T2 + ". Izračunata površina je " + rezultat);
	}
}
