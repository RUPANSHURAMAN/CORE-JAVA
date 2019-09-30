//*constructor with arg // if in a parent class there is only contructors with args then as a programmer we should explicity write super keyword in child class constructor // super keyord is NOT auto kept when therer are only args contructor in parent class whrere as super keyword will be placed auto when in the parent class therer is a constructor with no args   

class tion{
	tion(int i){  //if in a parent class there is only contructors with args then as a programmer we should explicitly write super keyword in child class constructor
		System.out.println(i);
	}
}

public class I extends tion{
	I(){
		super(500); //ERROR without it as comiler not add arg super() 
		//super(100); //need to be addeed if parent class contructor need to be called	//super(); not added by compiler as there is a arg constructor in a parent class
		System.out.println("B");
	}

	public static void main(String[] args) {
		new I();
	}
}
