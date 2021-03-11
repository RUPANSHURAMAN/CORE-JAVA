package regex5_notLetterLowerUpperNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
		Matcher matcher = pattern.matcher("bfq39#&*#!ubdq");
		
		while(matcher.find()){
			System.out.println(matcher.group()+"..."+matcher.start());
		}
		
		/* O/P
		 * #...5
		 * &...6
		 * *...7
		 * #...8
		 * !...9
		 */
	}
}
