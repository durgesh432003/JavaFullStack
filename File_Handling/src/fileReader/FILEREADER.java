package fileReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class FILEREADER {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader f = new FileReader("ABC.txt");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(f);
		
		String d = sc.nextLine();
		System.out.println(d);
		
	}
}
