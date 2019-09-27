package FileHandling2;

import java.io.FileOutputStream;

//write int in file
public class C {

	public static void main(String[] args) {
		Integer i = 5;
		byte data = i.byteValue();
		
		try {
			FileOutputStream fos = new FileOutputStream("/home/rupanshu/intData.txt");
			System.out.println("Writing int in file");
			fos.write(data); //NOT WORKING!!
			System.out.println("Successful!");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
