package DataTypes;

class B {
	static B b; // can be used anywhere the ref as static
	// static ref var = these ref var are created outside all methods but then these var can be used anywhere in the class
	
	int i; // DEfault value assigned by compiler

	public static void main(String[] args) {
		b = new B();
		System.out.println(b.i);
		b.test();
	}

	public void test() {
		System.out.println(b.i);
	}
}

public class Three6 {
	int i = 10;
	// ref var store address of object not ordinary value like 10, 20 
	// ref var is of two types 1.local and 2. static
	// 1) satic var not to be declared in method IMPOSSIBLE as it becomes local
	// ref var are used to store memory address, it can never store ordinary values
	// local ref var = they are created within a method and should be used only within created method e.g. class Three6
	
	public static void main(String[] args) {
		Three6 t6 = new Three6(); // local ref var not to be used outside
		System.out.println(t6.i);
		t6.test();
	}

	public void test() {
		// System.out.println(t6.i); // ERROR as local ref can't be used in method other than main
	}
}
