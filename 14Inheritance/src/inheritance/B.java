package inheritance;
// INHERITANCE - here non-static members (NOT static members) of parent class are inherited to the child 
// class object so that we can reuse the members of parent class or moving the members of parent to child memory 


public class B extends A {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.i);
		System.out.println(a1.j); // REPLACED BY a1.j ACTUALLY NOT INHERITED BUT COMPILER CONVERTS a1.j to ole.j
									// // static members do not get inherited but then they give us the feel of
									// inheritance by converting the stat accessing static member//j is checked by
									// compiler if extends if yes checks the class inherited has j present if yes
									// then replaced by <classname.j>
		a1.f(); // static method also is not inherited but syntax replaced by
				// <classs-name>.static_method()
	}
}
