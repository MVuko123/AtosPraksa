package zadatak06;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TablicaMnoženja {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		String ime = JOptionPane.showInputDialog(f, "Kako se zovete?");
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesite velicinu kvadratne matrice"));
		
		System.out.print("-------------------------------\n");
		System.out.print(" : : :  TABLICA MNOZENJA  : : :\n");
		System.out.print("-------------------------------\n");
		
		System.out.print("* | ");
		for(int i = 0; i < broj; i++) {
			System.out.format("%3d", i+1);
		}
		System.out.print("\n");
		
		System.out.print("-------------------------------\n");
		for(int i=1; i<=broj; i++){ 
			System.out.print(i + " | ");
		    for(int j=1; j<=broj; j++){
		    	System.out.format("%3d" ,i*j);
		    }
		        System.out.println();
	}
		
		System.out.print("-------------------------------\n");
		System.out.print(":  :  :  :  :  :  :  : by:" + ime + "\n");
		System.out.print("-------------------------------\n");
	}
}
