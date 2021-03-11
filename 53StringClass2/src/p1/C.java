package p1;

import static p1.A.reverseMethod;

// reverse only 'run' to 'run' in String
public class C {
	static String reverse = "";
	static String temp = "";

	public static void main(String[] args) {
		String s1 = "run Time call";
		String[] d = s1.split(" ");

		if (d[0].equals("run")) {
			temp = reverseMethod(d[0]) + " " + d[1] + " " + d[2];
		}
		if (d[1].equals("run")) {
			temp = d[0] + " " + reverseMethod(d[1]) + " " + d[2];
		}
		if (d[2].equals("run")) {
			temp = d[0] + " " + d[1] + " " + reverseMethod(d[2]);
		}
		
		System.out.println(temp);
	}
}
