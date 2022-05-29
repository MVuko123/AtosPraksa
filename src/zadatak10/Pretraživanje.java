package zadatak10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pretraživanje {
	public static void main (String[] args) {
		JFrame f = new JFrame();	

		boolean a = true;
		
		String putanja = "Nekakav put";
		File dir = new File(putanja);
		
		while(a) {
			putanja = JOptionPane.showInputDialog(f, "Unesite put do direktorija: ");
			
			dir = new File(putanja); 
			
			if(dir.isDirectory() == false) {
			JOptionPane.showMessageDialog(f, "Unijeli ste ne postojecu putanju! Pokusajte ponovno.");
			}else {				
				a = false;
			}			
		}		
		
		String[] datoteke = dir.list();
		
		if (datoteke.length == 0) {
			JOptionPane.showMessageDialog(f, "Direktori koji ste unijeli ne sadrži datoteke! Program će se ugasiti.");
			System.exit(1);
         }else {
        	  		
     		String fraza = JOptionPane.showInputDialog(f, "Unesite frazu koja će se tražiti u datotekama: ");
     		
     		for(int i = 0; i < datoteke.length; i++) {
     			
     			File file = new File(datoteke[i]);
     			String fileName = file.toString();
     			int index = fileName.lastIndexOf('.');
     			String extension = fileName.substring(index);
     			
     			
     			String putanjaDatoteke = "nešto";
     			
     			
     			if(fileName.endsWith(".txt")) {
     				putanjaDatoteke = dir + "\\" + datoteke[i];
     				
     			}else if(fileName.endsWith(".csv")) {
     				putanjaDatoteke = dir + "\\" + datoteke[i];
     				
     			}else {
     				putanjaDatoteke = dir + "\\" + datoteke[i++];
     				
     				if(i >= datoteke.length) {
     					
     					System.exit(1);
     				}
     			}
     			
     			
     			
     			try (BufferedReader br = new BufferedReader(new FileReader(putanjaDatoteke)))
     	        {
     				String trenutnaLinija;
     	            while ((trenutnaLinija = br.readLine()) != null) {
     	            	if(trenutnaLinija.contains(fraza)) {
     	            		JOptionPane.showMessageDialog(f, "Unijeli ste frazu: " + fraza + ", i ona je pronađena u datoteci: " + datoteke[i]);
     	            	}
     	            }
     	        } catch (IOException e) {
     	            e.printStackTrace();
     	        }
     		}
        	 
         }

		
	}
}
