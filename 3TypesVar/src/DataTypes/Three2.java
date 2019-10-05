package DataTypes;

//MEDIOCRE
public class Three2 {
	
	static int i = 10; // declared outside method, but inside class using static keyword 
							// static can be used anywhere in the class
	
	static int j; // default value assigned is zero , so not mandat to initialize static var as it
					// gets default value from compiler

	public static void main(String[] args) {
		System.out.println(Three2.i); // 10
		Three2 t2 = new Three2();
		t2.test();
	}

	public void test() {
		System.out.println(Three2.j); // 0
	}
}
