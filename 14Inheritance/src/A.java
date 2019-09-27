//INHERITANCE - here non-static members (NOT static members) of parent class are inherited to the child class object so that we can reuse the members of parent class //or moving the mebers of parent to child memory 

class ole{
	int i = 10;
	static int j = 20;

	static void f() {
		System.out.println("static method inherited");
	}
}

public class A extends ole{
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.i);
		System.out.println(a1.j); //REPLACED BY ole.j ACTUALLY NOT INHERITED BUT COMPILER CONVERTS a1.j to ole.j // static members do not get inherited but then they give us the feel of inheritance by converting the stat accessing static member//i is checked by compiler if extends if yes checks the class inherited has i present if yes then replaced by <classname.i>
		a1.f(); //static method also is not inherited but syntax replaced by <classs-name>.static_method() 
	}
}
