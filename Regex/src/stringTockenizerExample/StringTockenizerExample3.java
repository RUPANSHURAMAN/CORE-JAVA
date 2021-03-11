package stringTockenizerExample;

//split by //.
import java.util.regex.Pattern;

public class StringTockenizerExample3 {
public static void main(String[] args) {
	int count = 0;
	Pattern pattern = Pattern.compile("\\.");
	String[] s1 = pattern.split("pankaj sir.academy");
	
	for(String s:s1){
		count++;
	}
	
	System.out.println(count);//2
}
}
