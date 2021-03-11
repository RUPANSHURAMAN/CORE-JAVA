package regex1_not_abc;

/*
 * Regex: It helps us to perform form validation.
 * e.g. to check whether the mobile phone number is 10 digit and the mobile number starts with 6/7/8/9 if it is
 * for INDIA
 * 
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^abc]"); //NOt abc
		Matcher m = p.matcher("@7b@z#9");
		
		while (m.find()) {
			System.out.println(m.group()+"...."+m.start());
		}
		
		/* O/P
		 * @....0
		 * 7....1
		 * @....3
		 * z....4
		 * #....5
		 * 9....6
		 */
	}

}
