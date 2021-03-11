package p5;

public class A {
public static void main(String[] args) {
	assert test(); //HALTS AS FALSE returned
	System.out.println("From main()");
}

public static boolean test() {
	System.out.println("Test");
	return false;
}
}
