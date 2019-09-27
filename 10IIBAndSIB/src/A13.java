
public class A13 {
//we cannot initialize non-static var inside SIB //IIB can initialize static and non-static var like refernce var can access static and non-static aand nything sttaic belongs to class
	int i;
	static 
	{
		i =30;
	}
	
	public static void main(String[] args) {
		System.out.println("From main");
	}
}
