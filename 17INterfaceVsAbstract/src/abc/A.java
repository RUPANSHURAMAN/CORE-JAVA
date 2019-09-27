package abc;
//we can never create object of interface // 2) we can never keep main() in an interface 
public interface A {

	public int i = 10; //final and static appended as object of interface can't be created //every var by default is public in an interface

	void test1();
	
	/*A(){
		
	}*/ //ERROR we cannot keep a contructor inside an interface
}
