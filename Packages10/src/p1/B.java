package p1;

// Don't use test() as taken as method call
import static p2.C.test;	//CHANGE TO JDK v1.5 only STATIC IMPORT then works
public class B {
	public static void main(String[] args) {
		test();
	}
}
