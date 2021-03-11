package regex2_lowerAtoZ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-z]"); // lower a-z
		Matcher m = p.matcher("@7b@z#9");
		
		while (m.find()) {
			System.out.println(m.group()+"..."+m.start());
		}
		
		String name = "Rupanshu";
		String name_regex = "[a-zA-Z]+";
		
		if (name.matches(name_regex)) {
			System.out.println("Valid name");
		}else {
			System.out.println("Invalid name");
		}
		
		/* O/P
		 * b...2
		 * z...4
		 * Valid name
		 */
	}
}
