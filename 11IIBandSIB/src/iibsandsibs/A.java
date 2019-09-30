
public class A {
	{
		System.out.println("IIB"); //3
	}
	
	static {//START from SIB now not main()
		System.out.println("SIB"); //1
	}
	
	public static void main(String[] args) {
		A a1 = new A(); //2
	}
}
