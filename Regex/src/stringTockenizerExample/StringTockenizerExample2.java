package stringTockenizerExample;

import java.util.regex.Pattern;

public class StringTockenizerExample2 {
	public static void main(String[] args) {
		int count = 0;
		Pattern pattern = Pattern.compile("\\s");
		String[] s1 = pattern.split("pankaj sir academy");
		
		for(String s:s1){
			count++;
		}
		
		System.out.println(count);//3
	}
}
