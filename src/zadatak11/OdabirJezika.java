package zadatak11;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OdabirJezika {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		int odabir = 1;
		
		do {
			odabir = Integer.parseInt(JOptionPane.showInputDialog("Odaberite jezik koji želite da se prikaže: \n 1.Njemački \n 2.Španjolski \n 3.Finski"));
			if(odabir < 1 || odabir > 3) {
				JOptionPane.showMessageDialog(f, "Unijeli ste odabir koji ne postoji, pokušajte ponovno.");
			}
		}while(odabir < 1 || odabir > 3);
		
		String jezik = "hr";
		String drzava = "Hrvatska";
		
		switch(odabir) {
		case 1:
			jezik = "de";
			drzava = "Njemački";
			break;
		case 2:
			jezik = "es";
			drzava = "Španjolski";
			break;
		case 3: 
			jezik = "fi";
			drzava = "Finski";
			break;
		}
		
		Locale odabraniJezik = new Locale(jezik); //locale nam sluÅ¾i za jezike
		ResourceBundle uzrecice = ResourceBundle.getBundle("zadatak11.LabelsBundle", odabraniJezik); //sluzi za pristup u bundl-ovimas
        
        JOptionPane.showMessageDialog(f, "Hrvatski    " + drzava + "\n\n Pozdrav     " + uzrecice.getString("pozdrav") + 
        								"\n Zbogom     " + uzrecice.getString("zbogom") + "\n Dobar Dan     " + uzrecice.getString("dobarDan")
        								+ "\n Dobra Večer     " + uzrecice.getString("dobraVecer") + "\n Koliko je sati?     " + uzrecice.getString("kolikoJeSati"));
        

		
		
		
		
	}
}
