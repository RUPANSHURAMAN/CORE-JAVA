package regex4_letterLowerUpperNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-zA-Z0-9]");
		Matcher m = p.matcher("^$##rupanshuraman2121%##");
		
		while (m.find()) {
			System.out.println(m.group()+"..."+m.start());
		}
		
		/* O/P
		 * r...4
		 * u...5
		 * p...6
		 * a...7
		 * n...8
		 * s...9
		 * h...10
		 * u...11
		 * r...12
		 * a...13
		 * m...14
		 * a...15
		 * n...16
		 * 2...17
		 * 1...18
		 * 2...19
		 * 1...20
		 */
		
	}
}
