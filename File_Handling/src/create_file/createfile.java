package create_file;

import java.io.File;
import java.io.IOException; 
public class createfile { 
	public static void main(String[] args) throws IOException  
	{ 
		File f = new File("ABC.txt"); 
		boolean b = f.createNewFile(); 
		System.out.println(b); 
		} 
	}