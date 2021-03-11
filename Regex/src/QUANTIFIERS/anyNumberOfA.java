package QUANTIFIERS;
/*
 * any no. of a's including zero numbers as well
 * 
 * a* - zero 
 * 	|
 * 	|
 * 	 --> 1 or more GROUP
 * 
 * a+ - one
 * 	|
 * 	|
 * 	 --> or GROUP
 * 
 * a - only single
 * 
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class anyNumberOfA {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a]*");
		Matcher m = p.matcher("abaaabaaaab");
		
		while (m.find()) {
			System.out.println(m.group()+"...."+m.start());
		}
		
		/* O/P
		 * a....0
		 * ....1
		 * aaa....2
		 * ....5
		 * aaaa....6
		 * ....10
		 * ....11
		 */
	}
}
