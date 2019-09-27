package FileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

//BUFFERED WRITER
public class C {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("/home/rupanshu/createFile.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("hello");
			bw.newLine(); //newLine is present in BW not in FW
			bw.write("hello");
			bw.newLine();
			bw.write("hello");
			bw.newLine();
			
			bw.close(); //w/o it file is not written with contents
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
