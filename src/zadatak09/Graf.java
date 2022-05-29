package zadatak09;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Graf {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		int siječanj, veljača, ožujak, travanj, svibanj, lipanj, srpanj, kolovoz, rujan, listopad, studeni, prosinac;
		do {
			siječanj = Integer.parseInt(JOptionPane.showInputDialog("Unesite plaću za siječanj u rasponu od 0Kn do 4500kn:"));
			if(siječanj < 0 || siječanj > 4500) {
				JOptionPane.showMessageDialog(f, "Unijeli ste plaću izvan raspona! Pokusajte ponovno.");
			}
		}while(siječanj < 0 || siječanj > 4500);
		
		do {
			veljača = Integer.parseInt(JOptionPane.showInputDialog("Unesite plaću za veljaču u rasponu od 0Kn do 4500kn:"));
			if(veljača < 0 || veljača> 4500) {
				JOptionPane.showMessageDialog(f, "Unijeli ste plaću izvan raspona! Pokusajte ponovno.");
			}
		}while(veljača < 0 || veljača> 4500);
		
		do {
			ožujak = Integer.parseInt(JOptionPane.showInputDialog("Unesite plaću za ožujak u rasponu od 0Kn do 4500kn:"));
			if(ožujak < 0 || ožujak > 4500) {
				JOptionPane.showMessageDialog(f, "Unijeli ste plaću izvan raspona! Pokusajte ponovno.");
			}
		}while(ožujak < 0 || ožujak > 4500);
		
		do {
			travanj = Integer.parseInt(JOptionPane.showInputDialog("Unesite plaću za travanj u rasponu od 0Kn do 4500kn:"));
			if(travanj < 0 || travanj > 4500) {
				JOptionPane.showMessageDialog(f, "Unijeli ste plaću izvan raspona! Pokusajte ponovno.");
			}
		}while(travanj < 0 || travanj > 4500);
		
		do {
			svibanj = Integer.parseInt(JOptionPane.showInputDialog("Unesite plaću za svibanj u rasponu od 0Kn do 4500kn:"));
			if(svibanj < 0 || svibanj > 4500) {
				JOptionPane.showMessageDialog(f, "Unijeli ste plaću izvan raspona! Pokusajte ponovno.");
			}
		}while(svibanj < 0 || svibanj > 4500);
		
		do {
			lipanj = Integer.parseInt(JOptionPane.showInputDialog("Unesite plaću za lipanj u rasponu od 0Kn do 4500kn:"));
			if(lipanj < 0 || lipanj > 4500) {
				JOptionPane.showMessageDialog(f, "Unijeli ste plaću izvan raspona! Pokusajte ponovno.");
			}
		}while(lipanj < 0 || lipanj > 4500);
		
		do {
			srpanj = Integer.parseInt(JOptionPane.showInputDialog("Unesite plaću za srpanj u rasponu od 0Kn do 4500kn:"));
			if(srpanj < 0 || srpanj > 4500) {
				JOptionPane.showMessageDialog(f, "Unijeli ste plaću izvan raspona! Pokusajte ponovno.");
			}
		}while(srpanj < 0 || srpanj > 4500);
		
		do {
			kolovoz = Integer.parseInt(JOptionPane.showInputDialog("Unesite plaću za kolovoz u rasponu od 0Kn do 4500kn:"));
			if(kolovoz < 0 || kolovoz > 4500) {
				JOptionPane.showMessageDialog(f, "Unijeli ste plaću izvan raspona! Pokusajte ponovno.");
			}
		}while(kolovoz < 0 || kolovoz > 4500);
		
		do {
			rujan = Integer.parseInt(JOptionPane.showInputDialog("Unesite plaću za rujan u rasponu od 0Kn do 4500kn:"));
			if(rujan < 0 || rujan > 4500) {
				JOptionPane.showMessageDialog(f, "Unijeli ste plaću izvan raspona! Pokusajte ponovno.");
			}
		}while(rujan < 0 || rujan > 4500);
		
		do {
			listopad = Integer.parseInt(JOptionPane.showInputDialog("Unesite plaću za listopad u rasponu od 0Kn do 4500kn:"));
			if(listopad < 0 || listopad > 4500) {
				JOptionPane.showMessageDialog(f, "Unijeli ste plaću izvan raspona! Pokusajte ponovno.");
			}
		}while(listopad < 0 || listopad > 4500);
		
		do {
			studeni = Integer.parseInt(JOptionPane.showInputDialog("Unesite plaću za studeni u rasponu od 0Kn do 4500kn:"));
			if(studeni < 0 || studeni > 4500) {
				JOptionPane.showMessageDialog(f, "Unijeli ste plaću izvan raspona! Pokusajte ponovno.");
			}
		}while(studeni < 0 || studeni > 4500);
		
		do {
			prosinac = Integer.parseInt(JOptionPane.showInputDialog("Unesite plaću za prosinac u rasponu od 0Kn do 4500kn:"));
			if(prosinac < 0 || prosinac > 4500) {
				JOptionPane.showMessageDialog(f, "Unijeli ste plaću izvan raspona! Pokusajte ponovno.");
			}
		}while(prosinac < 0 || prosinac > 4500);
		
		int[] plaće = {siječanj, veljača, ožujak, travanj, svibanj, lipanj, srpanj, kolovoz, rujan, listopad, studeni, prosinac};
		
		
		
		for(int i = 0; i < 12; i++) {
			if(plaće[i] < 500) {
				plaće[i] = 0;
			}
			else if(plaće[i] >= 500 && plaće[i] < 1000 )		
			{
				plaće[i] = 500;
			}
			else if(plaće[i] >= 1000 && plaće[i] < 1500  )		
			{
				plaće[i] = 1000;
			}
			else if(plaće[i] >= 1500 && plaće[i] < 2000 )		
			{
				plaće[i] = 1500;
			}
			else if(plaće[i] >= 2000 && plaće[i] < 2500 )		
			{
				plaće[i] = 2000;
			}
			else if(plaće[i] >= 2500 && plaće[i] < 3000 )		
			{
				plaće[i] = 2500;
			}
			else if(plaće[i] >= 3000 && plaće[i] < 3500 )		
			{
				plaće[i] = 3000;
			}
			else if(plaće[i] >= 3500 && plaće[i] < 4000 )		
			{
				plaće[i] = 3500;
			}
			else if(plaće[i] >= 4000 && plaće[i] < 4500 )		
			{
				plaće[i] = 4000;
			}
			else if(plaće[i] >= 4500)		
			{
				plaće[i] = 4500;
			}
		}
		System.out.format("%5dkn - |",5000);
		System.out.format("\n          |");
		postaviX(plaće, 4500);
		System.out.format("\n%5dkn - |",4000);
		postaviX(plaće,4000);
		System.out.format("\n          |");
		postaviX(plaće,3500);
		System.out.format("\n%5dkn - |",3000);
		postaviX(plaće,3000);
		System.out.format("\n          |");
		postaviX(plaće,2500);
		System.out.format("\n%5dkn - |",2000);
		postaviX(plaće,2000);
		System.out.format("\n          |");
		postaviX(plaće,1500);
		System.out.format("\n%5dkn - |",1000);
		postaviX(plaće,1000);
		System.out.format("\n          |");
		postaviX(plaće,500);
		System.out.format("\n%5dkn - |", 0);
		postaviX(plaće, 0);
		
		System.out.println("\n            -- -- -- -- -- -- -- -- -- -- -- -- ");
		System.out.println("             1  2  3  4  5  6  7  8  9 10 11 12");
		
	
	}
	
	public static void postaviX(int[] plaće, int cifra) { 
		//for (int i = 0; i< 11; i++) {
			for(int j = 0; j < 12; j++) {
				if(plaće[j] == cifra) {
					System.out.print(" x ");
				}else {
					System.out.print("   ");
				}
			}
		}

	}
//}
