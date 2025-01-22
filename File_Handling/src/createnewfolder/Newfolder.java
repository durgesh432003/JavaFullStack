package createnewfolder;

import java.io.File;

public class Newfolder {
	
	public static void main(String args []) {
		
		File f = new File("Durgesh12");
		boolean b = f.mkdir();
		System.out.println(b);
	}
	
}
