package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[abc]");
		Matcher m = p.matcher("@7b@z#9");
		
		while (m.find()) {
			System.out.println(m.group()+"...."+m.start());
		}
		
		/* O/P
		 * b....2
		 */
	}
}
