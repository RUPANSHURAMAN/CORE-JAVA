package regex9_notDigits;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\D"); //will read only other than digits all chars from string
		Matcher m = p.matcher("@7b@z#9");
		
		while (m.find()) {
			System.out.println(m.group()+"..."+m.start());
		}
		
		/* O/P
		 * @...0
		 * b...2
		 * @...3
		 * z...4
		 * #...5
		 */
	}
}
