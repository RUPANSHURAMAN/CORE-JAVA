
public class A4 {

	{
		System.out.println("From IIB"); //2
	}
	
	A4(){
		System.out.println("From custructor");//3
	}
	public static void main(String[] args) {
		A4 a1 = new A4();//1
		System.out.println("From main");//4
	}

}
