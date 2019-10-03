package sibiib;
//MEDIOCRE
public class A5 {

	{
		System.out.println("From IIB"); //2
	}
	
	A5(){
		System.out.println("From custructor");//3
	}
	public static void main(String[] args) {
		System.out.println("Start main");//0
		A5 a1 = new A5();//1
		System.out.println("End main");//4
	}

}
