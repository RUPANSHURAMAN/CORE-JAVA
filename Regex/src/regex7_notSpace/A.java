package regex7_notSpace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\S"); //everything except space
		Matcher matcher = pattern.matcher("sbd ajsd sandsa");
		
		while (matcher.find()) {
			System.out.println(matcher.group()+"..."+matcher.start());
		}
		
		/* O/P
		 * s...0
		 * b...1
		 * d...2
		 * a...4
		 * j...5
		 * s...6
		 * d...7
		 * s...9
		 * a...10
		 * n...11
		 * d...12
		 * s...13
		 * a...14
		 */
	}
}
