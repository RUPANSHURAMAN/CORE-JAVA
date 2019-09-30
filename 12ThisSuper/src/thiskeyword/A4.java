
public class A4 {
public static void main(String[] args) {
	A4 a1 = new A4();
	a1.test(100);
}

public void test(int i) { //int i is also a local var
	// this.i = i; //ERROR localvar can't be accessed by this keyword
	// System.out.println(this.i); //ERROR localvar can't be accessed by this keyword
}
}
