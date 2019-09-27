
public class B {
	{
		System.out.println("IIB"); //2
	}
	
	B(){
		System.out.println("B"); //3
	}
	
	static {//START OF PGM
		System.out.println("SIB"); //1
	}
	
	public static void main(String[] args) {
		new B();
	}
}
