
public class E {
	static E a1;
	int  i =10;
	E(){
		System.out.println("no args");
	}
	
	E(E a2){
		System.out.println(a2.i);
	}
	
	public static void main(String[] args) {
		E a1 = new E();
		new E(a1);
	}
}
