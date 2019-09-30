
public class A3 {
int i; //static and non-static can never have same name as common space only static and local and non-static local can have same name

public static void main(String[] args) {
	A a1 = new A();
	a1.test();
}

public void test() { 
	int i = 10;
	this.i = i;
	System.out.println(this.i); //when var name is same this keyword can only access only non-static var and can't access  local var
}
}
