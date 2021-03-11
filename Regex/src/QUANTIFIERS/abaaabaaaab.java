package QUANTIFIERS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class abaaabaaaab {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher("abaaabaaaab");
		
		while (m.find()) {
			System.out.println(m.group()+"...."+m.start());
		}
		
		/* O/P
		 * a....0
		 * a....2
		 * a....3
		 * a....4
		 * a....6
		 * a....7
		 * a....8
		 * a....9
		 */
	}
}
