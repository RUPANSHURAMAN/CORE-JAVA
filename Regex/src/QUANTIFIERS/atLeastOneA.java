package QUANTIFIERS;

/*
 * atleast one occurance of a including zero (single occurance including 0)
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class atLeastOneA {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a]?");
		Matcher m = p.matcher("abaaabaaaab");
		
		while (m.find()) {
			System.out.println(m.group()+"...."+m.start());
		}
		
		/* O/P
		 * a....0
		 * ....1
		 * a....2
		 * a....3
		 * a....4
		 * ....5
		 * a....6
		 * a....7
		 * a....8
		 * a....9
		 * ....10
		 * ....11
		 */
	}
}
