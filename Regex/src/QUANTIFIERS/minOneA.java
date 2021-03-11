package QUANTIFIERS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class minOneA {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a]+");
		Matcher m = p.matcher("abaaabaaaab");
		
		while (m.find()) {
			System.out.println(m.group()+"...."+m.start());
		}
		
		/* O/P
		 * a....0
		 * aaa....2
		 * aaaa....6
		 */
	}
}
