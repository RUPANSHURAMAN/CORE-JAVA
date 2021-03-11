package regex11_notWhiteSpace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\W");//[^a-zA-Z0-9] will give other than letters(upper and lower)
							//and digits will return any other special chars
		Matcher m = p.matcher("@7b@z#9");
		
		while (m.find()) {
			System.out.println(m.group()+"...."+m.start());
		}
		
		/* O/P
		 * @....0
		 * @....3
		 * #....5
		 */
		
	}
}
