package p3;

// @Deprecated: It helps us to notify that a particular method is not in use. but still it can be called
public class A {
public static void main(String[] args) {
	A a1 = new A();
	a1.test();
}

@Deprecated
public void test(){
	System.out.println("From test");
}
}
