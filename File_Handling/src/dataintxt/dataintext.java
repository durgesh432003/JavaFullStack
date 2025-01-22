package dataintxt;

import java.io.IOException;
import java.io.FileWriter;

public class dataintext {
	
	public static void main(String[] args) throws IOException 
	{
		
		FileWriter f = new FileWriter("ABC.txt");
		
		f.write("hello java");
		f.flush();
		f.close();
		System.out.println("successful creation of data");
	}
	

}
