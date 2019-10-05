package FileHandling2;

// REFER ALL FILE CLASSES IN 24.FileClass.A
//* FileInputStream - It helps us to read the content in the file e.g.

/*   ____________________																	 ______________________	
 *   |Pankaj			|																	 |97    (stored as    |
 *   |||				|																	 |   [BYTE] in RAM    |
 *   |||				|====> 97 to binary(101001001) ==> binary to signal ==> -_-__-__- ==>|   and retrieved    |
 *   | ===> P to 97		| 																	 |   as number which  |
 *   |					|																	 |	 need to typecast |
 *   --------------------																	 |   as char)         |
 *   	D://testing																			 ======================
 *   																							  RAM of BYTES
 */

import java.io.FileInputStream;

public class A {
	public static void main(String[] args) {
		// FileInputStream fis =
		// new FileInputStream(""); //ERROR even though file exists as it's mandat to
		// surround under try-catch block as its madat for every compile time exception
		// like FileNotFound, IO, SQL exception

		try {
			FileInputStream fis = new FileInputStream("/home/rupanshu/readFile.txt"); // used to read content of file

			//need to comment both syso as the read pointer moves forward after reading that letter not print it again next time
			// System.out.println(fis.read()); // prints a number as in RAM when file loaded was converted from bin to 
														//number and read() only reads one char one time

			// System.out.println((char)fis.read()); // prints the number above to (char) by typecasting

			// to read whole file use for-loop
			for (int i = 0; i < 215; i++) {
				System.out.print((char) fis.read());
			}
		} catch (Exception e) { // Exception class is used as new FileStream throws FileNotFound and fis.read()
								// throws IOException so need superclass
			System.out.println(e);
		}
	}
}
