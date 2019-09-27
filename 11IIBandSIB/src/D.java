
public class D {
	{
		System.out.println("IIB"); //2
	}
	
	static { //START OF PGM
		new D();//1
		System.out.println("SIB"); //4
	}
	
	D(){
		System.out.println("D"); //3
	}
	
	public static void main(String[] args) {
		System.out.println("main");//5
	}
}
