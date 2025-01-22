package txtinfolder;

import java.io.File;
import java.io.IOException;
public class fileinfolder {
	public static void main(String args []) throws IOException{
		
		File f = new File("JAVA");
		boolean b = f.mkdir();
		System.out.println(b);
		
		File d = new File(f,"ABC.txt");
		boolean c = d.createNewFile();
		System.out.println(c);
	}
	

}
