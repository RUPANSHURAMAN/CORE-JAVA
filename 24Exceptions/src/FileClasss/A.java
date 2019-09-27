package FileClasss;

/* FILE CLASS
 * Every file has some significance
		* File : used to create file, check if file exists(), count bytes or size, delete file,,, create and delete folder
		* 
		* FileReader : can only read file can't create File
		* FileWriter : (2) mandat to close file to write contents after write()
		* 
		* BufferedReader
		* BufferedWriter
		* 
		* FileInputStream
		* FileOutputStream
 * 
 * ONLY fos and fis needs to be in try-catch as throws Exceptions
 */

import java.io.File;

public class A {

	public static void main(String[] args) {
		File file = new File("/home/rupanshu/createFile.txt"); // doesn't create exception like FIS, FOS as at that time on class was memoryoutexception
		File createFolder = new File("/home/rupanshu/createFolder");
		try {
			System.out.println("Creating File");
			
			file.createNewFile(); //need try catch as File.createNewFile() throws IOException
			
			// file.delete(); //deletes the file from path given
			
			System.out.println("File exists: " + file.exists()); // check if file exists()
			
			System.out.println(file.length()); // gives size in bytes, each byte = one char
			
			
			createFolder.mkdir();//creates directory or folder
			// createFolder.delete(); //deletes the directory
			System.out.println(createFolder.exists()); //checks if folder exists
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
