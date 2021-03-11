package birlasoft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class TryWithResource {

public static void main(String[] args) {
	HashMap<String, String> hashMap = new HashMap<>();
//	Stream.of(hashMap).forEach(System.out::println, System.out::println);
	int binary = 0b1;
	for (Map.Entry<String, String> entry : hashMap.entrySet()) {
		
	}
	System.out.println("Number: "+binary);
	OpenOption charset = null;
	Path outputFilePath = null;
	
    String zipFileName = null;
	try (
			java.util.zip.ZipFile zf =
	             new java.util.zip.ZipFile(zipFileName  );
			java.io.BufferedWriter writer = 
	            java.nio.file.Files.newBufferedWriter(outputFilePath, charset);
	            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("")))
	    ) {
	        // Enumerate each entry
	        for (java.util.Enumeration entries =
	                                zf.entries(); entries.hasMoreElements();) {
	            // Get the entry name and write it to the output file
	            String newLine = System.getProperty("line.separator");
	            String zipEntryName =
	                 ((java.util.zip.ZipEntry)entries.nextElement()).getName() +
	                 newLine;
	            writer.write(zipEntryName, 0, zipEntryName.length());
	        }
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
