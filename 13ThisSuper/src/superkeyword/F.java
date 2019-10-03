package superkeyword;
class java{
	java(){
		System.out.println("A");
	}
}
public class F extends java{

	F(){
		/*super();*/  //super keyword auto added by compiler and can ONLY call no args contrutor
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		new F();
	}
}
