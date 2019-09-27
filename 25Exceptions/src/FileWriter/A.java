package FileWriter;

import java.io.File;
import java.io.FileWriter;

//FILE WRITER CLASS: it's mandat to close the file exlse content not written
public class A {

	public static void main(String[] args) {
		try {
			File f = new File("/home/rupanshu/createFile.txt"); //for checking if file written by checking lenght()
			FileWriter fw = new FileWriter(f);
			
			fw.write("xyz");
			System.out.println(f.length()); //0 Output. as file not closed to write content
			
			fw.close();
			System.out.println(f.length()); //3 Output. as file not closed to write content	
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
