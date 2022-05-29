package zadatak12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class brojacRijeci {
	public static void main(String[] args) throws IOException {
		
		Map<String,Integer> rijeci=new HashMap<String, Integer>();
		JFrame f = new JFrame();
		String putanja = "Nekakav put";
		File file = new File(putanja);
		boolean a = true;
		
		while(a) {
			putanja = JOptionPane.showInputDialog(f, "Unesite put do željenog file-a: ");
			
			file = new File(putanja); 
			
			if(file.isFile() == false) {
			JOptionPane.showMessageDialog(f, "Unijeli ste ne postojecu putanju! Pokusajte ponovno.");
			}else {				
				a = false;
			}			
		}
		
		/*String[] rijeci = null;
		int brojac = 0;
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String s;
	      while((s=br.readLine())!=null)    
	      {
	    	 rijeci=s.split(" ");   
	    	 brojac=brojac+rijeci.length;   
	      }
	      fr.close();
	      System.out.println("Number of words in the file:" +brojac);  */ 
		
		brojacRijeci(putanja, rijeci);
		System.out.println("U datoteci "+file.getName()+" nalaze se sljedece rijeci:");
		System.out.println("------------------------\n"				+ "Rijec (broj ponavljanja)\n"				+ "------------------------");
		rijeci.forEach((k,v)->System.out.printf("%s (%d)\n", k,v));
		System.out.println("------------------------");
		
	}
	
	static void brojacRijeci(String putanja, Map<String, Integer> rijeci) throws FileNotFoundException {
		Scanner file2 = new Scanner(new File(putanja));
		
	    while(file2.hasNext()) {

			String rijec = file2.next();
			rijec = rijec.toLowerCase(); 
			//rijec.replaceAll("[a-zA-Z]", "");
			Integer brojac = rijeci.get(rijec);
			if(brojac != null) {
				brojac++;
			}
			else {
				brojac=1;
			}
			rijeci.put(rijec, brojac);			
		}
	    file2.close();
	}
}
