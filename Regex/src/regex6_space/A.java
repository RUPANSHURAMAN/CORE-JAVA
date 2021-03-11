package regex6_space;

/*
 * \s - searches for space char in the given string
 * \S - searches for any other char except space char
 * \d - searches for all digits
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\s"); //ERROR if single \
		Matcher matcher = pattern.matcher("sbd ajsd sandsa");
		
		while (matcher.find()) {
			System.out.println(matcher.group()+"..."+matcher.start());
		}
		
		/* O/P
		 *  ...3
		 *  ...8
		 */
	}
}
