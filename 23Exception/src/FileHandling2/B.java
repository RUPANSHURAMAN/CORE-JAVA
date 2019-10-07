package FileHandling2;

import java.io.FileOutputStream;

// Stream means streamed in bytes
/*
 *  difference b/w FIS and FOS? IS used to read the data and FOS is used to write the data
 *  where are the classes present? in java.io package
 */
public class B {

	public static void main(String[] args) {

		String s = "rupanshu rama";
		byte[] bytes = s.getBytes(); // as RAM stores only bytes so convert char to bytes

		try {
			// It is mandat to convert data to bytes then only we can use FOS
			FileOutputStream fos = new FileOutputStream("/home/rupanshu/writeFile.txt");

			System.out.println("File writing started...");
			fos.write(bytes); // write() transfers bytes to RAM and then to char into txt, NO need to close the file
			System.out.println("Operation successful!");
			
			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			Integer i = 5;
			byte data = i.byteValue();
			fos.write(5); //writing int value doesn't work NOT WORKING!! have to use toString to write int
			
			fos.write(bytes); // writing again string to confirm
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
