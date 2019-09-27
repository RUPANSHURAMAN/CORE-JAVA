
class No{
	No(){
		System.out.println("No");
	}
}
public class D extends No{
	
	D(){//if we don't keep super keyword inside child class constructor then compiler will automatically place the super keyword such that it can call only no-args constructor of parent class 
		
	}
public static void main(String[] args) {
	new D();
}
}
