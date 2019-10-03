package designconstructors;
// MEDIOCRE
public class E {
	int i = 10;

	E() {
		System.out.println("E");
	}

	public static void main(String[] args) {
		System.out.println(new E().i); // as anonymous object memory address can be only once used and either a method 
										// or a var can be accessed once
	}
}
