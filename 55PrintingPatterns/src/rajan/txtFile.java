package rajan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class txtFile {
public static void main(String[] args) throws FileNotFoundException {
	File f = new File("New Text Document.txt");
	BufferedReader bufferedReader = new BufferedReader(new FileReader("H:\\YO\\CORE_JAVA\\55PrintingPatterns\\src\\rajan\\New Text Document.txt"));
	
	Stream lines = bufferedReader.lines();
	
	for (Object lineObject : lines.toArray()) {
		String[] lineString = lineObject.toString().split(" ");
		String username = lineString[0];
		String password = lineString[1];
		System.out.println("username = "+ username + ", password= "+password);
		//write selenium code sendKeys(username) and sendKeys(password)
		
	}
}
}
