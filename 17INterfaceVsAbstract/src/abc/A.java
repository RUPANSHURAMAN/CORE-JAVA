package abc;

// 1) we can never create object of interface 
// 2) we can never keep main() in an interface 
public interface A {

	public int i = 10; // final and static appended as object of interface can't be created 
						//every var by default is public in an interface
	//int j; //ERROR as not initialized
	static int k = 50;
	
	public static void main(String[] args) { //In java 8
		System.out.println(54155);
	}
	
	
	void test1();

	/*
	 * A(){
	 * 
	 * }
	 */ // ERROR we cannot keep a constructor inside an interface
}
