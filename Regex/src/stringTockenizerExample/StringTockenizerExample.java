package stringTockenizerExample;
import java.util.StringTokenizer;


/*
 * Specially designed class for tockenization activity.
 */
public class StringTockenizerExample {
	public static void main(String[] args) {
		StringTokenizer stringTokenizer = new StringTokenizer("pankaj sir academy");
		
		while(stringTokenizer.hasMoreElements()){
			System.out.println(stringTokenizer.nextToken());
		}
	}
}
