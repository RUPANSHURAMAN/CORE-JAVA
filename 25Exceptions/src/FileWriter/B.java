package FileWriter;

import java.io.BufferedReader;
import java.io.FileReader;

//FOS vs. FW? FOS requires the content to be converted into number using getBytes() whereas FileWriter can write directly string contents 
// File CLASS can be used with FileReader and FilWriter and FOS, FIS but then it cannot be used with BufferedReader and BufferedWriter directly
// BufferedReader is used to inc the performance and can also read the data Line by Line e.g.
public class B {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/home/rupanshu/createFile.txt");
			BufferedReader br = new BufferedReader(fr); //File arg doesn't work with BR as only works for FR, FW
			
			System.out.println(br.readLine()); //fast as uses BUFFer MEMory and no need to convert from bytes to char as whole line read once
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
