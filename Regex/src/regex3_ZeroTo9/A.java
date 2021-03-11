package regex3_ZeroTo9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9]"); //allDigits
		Matcher m = p.matcher("9855116541");
		
		while (m.find()) {
			System.out.println(m.group()+"..."+m.start());
		}
		
		/* O/P
		 * 9...0
		 * 8...1
		 * 5...2
		 * 5...3
		 * 1...4
		 * 1...5
		 * 6...6
		 * 5...7
		 * 4...8
		 * 1...9
		 */
	}
}
