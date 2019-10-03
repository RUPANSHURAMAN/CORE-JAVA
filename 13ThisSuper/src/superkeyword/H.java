package superkeyword;

class pro{
	pro(){
		System.out.println("A");
	}
}

public class H extends pro{

	H(int i){
		/* super*/ //even in arg constructor super keyword is added auto by compiler of no-arg type
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		new H(100);
	}
	
}
