//MULTIple IIB's
public class A6 {

	{
		System.out.println("From IIB - 2"); //2
	}
	
	
	A6(){
		System.out.println("From custructor");//3
	}
	
	{
		System.out.println("From IIB - 1"); //2
	}
	
	public static void main(String[] args) {
		System.out.println("Start main");//0
		A6 a1 = new A6();//1
		System.out.println("End main");//4
	}

}
