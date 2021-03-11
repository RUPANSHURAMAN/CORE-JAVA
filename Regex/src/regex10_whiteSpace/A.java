package regex10_whiteSpace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\w"); //[a-zA-Z0-9] will read only letters(uppercase and lowercase) and
												// digits but will not read special chars
		Matcher m = p.matcher("@7b@z#9");
		
		while (m.find()) {
			System.out.println(m.group()+"...."+m.start());
		}
		
		/* O/P
		 * 7....1
		 * b....2
		 * z....4
		 * 9....6
		 */
	}
}
