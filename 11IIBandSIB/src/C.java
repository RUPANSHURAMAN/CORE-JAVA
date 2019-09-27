
public class C {
	{//3
		System.out.println("1");
	}
	
	{//4
		System.out.println("2");
	}
	
	static { //START OF PGM
		System.out.println("3"); //1
	}
	
	C(){ //5
		System.out.println("4");
	}
	
	public static void main(String[] args) {
		C c1 = new C(); //2
		System.out.println("main");
	}
}
