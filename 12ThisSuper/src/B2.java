
public class B2 {
B2(int i){
	System.out.println(i);
}

B2(){
	this(100); //this keyword can also be used to call parameterised constructor
	System.out.println("B2");
}

public static void main(String[] args) {
	B2 b1 = new B2();
}
}
