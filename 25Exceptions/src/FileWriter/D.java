package FileWriter;

import java.io.File;

public class D {
public static void main(String[] args) {
	try {
		File f1 = new File("/home/rupanshu/createFile.html");
		f1.createNewFile();
		
		File f2 = new File("/home/rupanshu/createFile.png");
		f2.createNewFile();
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
