package FileWriter;

import java.io.FileInputStream;

public class E {

	public static void main(String[] args) {
		int i = 0;
		
		try {
			FileInputStream fis = new FileInputStream("/home/rupanshu/createFile.txt");
			
			// while is used when no. of loops not known
			while((i = fis.read())!=-1) { // -1 is placed auto at the EOF to signify end of file
				System.out.print((char)i);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
