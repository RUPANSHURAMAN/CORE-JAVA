
public class A3 {

	{
		System.out.println("From IIB"); //Two times called
	}
	
	A3(){
		System.out.println("From custructor");
	}
	public static void main(String[] args) {
		A3 a1 = new A3();
	}

}
