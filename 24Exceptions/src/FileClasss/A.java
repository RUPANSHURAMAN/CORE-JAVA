package FileClasss;

/* FILE CLASS
 * 
 * Every file IO class has some significance
 * 
 * File :[NO EXCEPTION] used to create file, check file exists(), count bytes or size, delete file, create-delete folder
 * 
 * FileInputStream(File): mandat to convert byte to char|| *can only read file can't create File 
 * FileOutputStream(File): not mandat to close file to write contents after write()
 * 
 * FileReader(File) : mandat to convert byte to char|| *can only read file can't create File || 
 * FileWriter(File) : mandat to close file to write contents after write()|| directly write strings
 * 
 * BufferedReader(FR) : readLine() faster, directly reads string w/o converting byte to char
 * BufferedWriter(FW): mandat to close file to write contents after write()|| write() and nextLine()|| directly write strings
 * 
 *  fos and fis needs to be in try-catch as throws Exceptions
 */

import java.io.File;

public class A {

	public static void main(String[] args) {
		File file = new File("/home/rupanshu/createFile.txt"); // DOESN'T create exception like FIS, FOS 
		File createFolder = new File("/home/rupanshu/createFolder");
		try {
			System.out.println("Creating File");

			file.createNewFile(); // need try catch as File.createNewFile() throws IOException

			// file.delete(); //deletes the file from path given

			System.out.println("File exists: " + file.exists()); // check if file exists()

			System.out.println(file.length()); // gives size in bytes, each byte = one char

			createFolder.mkdir();// creates directory or folder
			// createFolder.delete(); //deletes the directory
			System.out.println(createFolder.exists()); // checks if folder exists
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
