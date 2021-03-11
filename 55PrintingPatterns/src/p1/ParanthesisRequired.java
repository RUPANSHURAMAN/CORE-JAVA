package p1;

public class ParanthesisRequired {
public static void main(String[] args) {
	String input = "()()))))";
	int countOpen = 0, countClose = 0;
	
	for (int i = 0; i < input.length(); i++) {
		if (input.charAt(i) == '(')
			countOpen++;
		else {
			countClose++;
		}
	}
	
	System.out.println(Math.abs((countOpen-countClose)));
}
}
