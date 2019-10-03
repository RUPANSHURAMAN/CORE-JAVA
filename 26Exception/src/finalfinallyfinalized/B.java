package finalfinallyfinalized;

import java.io.FileInputStream;
//we use finally very often to perform close operation 
public class B {

	static FileInputStream fis;

	public static void main(String[] args) {
		
		try {
			fis = new FileInputStream("/home/rupanshu/createFile.txt");
			System.out.println(fis.read());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try { //one more try-catch
				if(fis!=null) {
				fis.close();
				System.out.println("File closed.");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
