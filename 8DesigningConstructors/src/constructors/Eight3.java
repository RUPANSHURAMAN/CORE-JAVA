package constructors;

public class Eight3 {
	
	/* static Eight3(int i){ //ERROR as only public, private, protected is allowed
		
	}*/
	
	Eight3(){ //constructor called 3 times as 3 times object created
		System.out.println("c");
	}
public static void main(String[] args) {
	new Eight3();
	new Eight3();
	new Eight3();
	
}
}
