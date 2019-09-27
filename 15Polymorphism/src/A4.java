//overloading here we create multiple methods with same but then they are differntiated based on number and type of args //polymorphism is run time and compile time as overrrfiing happens when .class file runs whereas compile time happens [during] .class file is being created
public class A4 {
private void test() {
	System.out.println("test");
}

public void test(int i, int j) {
	System.out.println(i);
	System.out.println(j);
}

public static void main(String[] args) {
	A4 a1 = new A4();
	a1.test(3, 5);
	
}
}
