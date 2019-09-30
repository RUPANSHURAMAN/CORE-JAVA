//with method
public class F {
public void test() {
	System.out.println("test");
}

public static void main(String[] args) {
	new F().test();
}

{
	System.out.println("IIB");
}

F(){
	System.out.println("F");
}
}
