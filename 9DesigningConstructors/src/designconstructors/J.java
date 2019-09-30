
public class J {
int i = 10;
void J() {
	System.out.println("J");
}
//Constructor vs. method: a method can be void or it can have return type but constructor always void by default
//method is executed when we call it but a constructor executed on object creation
J(){
	System.out.println("From hello World");
}

public static void main(String[] args) {
	new J().J();
}
}
