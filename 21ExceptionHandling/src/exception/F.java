package exception;

public class F {

	int i = 10;
	F (F f1){
		System.out.println(f1.i);
	}
	
	F(){
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		F f2 = new F();
		F f3 = f2;
		new F(f3);
	}
}
