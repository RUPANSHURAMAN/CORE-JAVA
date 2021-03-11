package regex8_allDigits;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d"); //will read all digits
		Matcher m = p.matcher("@7b@z#9");
		
		while (m.find()) {
			System.out.println(m.group()+"..."+m.start());
		}
		
		/* O/P
		 * 7...1
		 * 9...6
		 */
	}
}
