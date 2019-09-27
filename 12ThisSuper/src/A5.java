
public class A5 {
int i;
A5(int i){  //local var
	this.i = i; // local var copied to this.i and so non-static var value = 100
	System.out.println(this.i);
}

public static void main(String[] args) {
	new A5(100);
}
}
