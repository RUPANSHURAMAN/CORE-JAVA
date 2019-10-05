package FileClasss;

import java.io.FileReader;
import java.io.File;

public class BFileReader {

	public static void main(String[] args) {
		// *File class will help us to count the number of chars in given file whereras filereader will help us to 
							//read the content of the file, EOF or -1 can be used when while
		
		// File class in below pgm helps us to build for loop dynamically
		File f = new File("/home/rupanshu/createFile.txt");

		try {
			FileReader fr = new FileReader(f);
			for (int i = 0; i < f.length(); i++) {
				System.out.print((char) fr.read());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
