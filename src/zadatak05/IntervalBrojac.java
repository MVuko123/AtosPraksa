package zadatak05;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class IntervalBrojac {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		int max = 109;
		int min = 9;
		
		if(min > 10 || max < 100) {
			JOptionPane.showMessageDialog(f, "Intervali nisu dobro namješteni!");
			System.exit(1);
		}
		
		int[] randomBrojevi = new int [(max-min)];
		for(int i = 0; i < randomBrojevi.length; i++) {
		
			randomBrojevi[i] = (int) ((Math.random() * (max - min)) + min);			 
		}
		
		/*for(int j = 0; j < randomBrojevi.length; j++) {
			System.out.println(randomBrojevi[j]);
		}*/
		
				
		int brojac = 0;
		
		for(int i = 0; i < randomBrojevi.length; i++) {
			
			//System.out.println(randomBrojevi[i]);
			if(randomBrojevi[i] <= 18) {
				brojac += 4;
			}
			if(randomBrojevi[i] > 18) {
				brojac -= 1;
			}
			if(randomBrojevi[i] % 20 == 0) {
				//i++;
				//System.out.println(randomBrojevi[i]);	
				continue;

			}
			if(randomBrojevi[i] >= 75) {
				JOptionPane.showMessageDialog(f, "Vrijednost brojaca je: " + brojac);
				System.exit(1);
			}
			
		}
		


	}
}
