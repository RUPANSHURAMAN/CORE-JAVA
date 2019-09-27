
class doc{
	doc(int i){
		System.out.println(i);
	}

	doc(int i, int j){//if this constructor removeed then eroor in J()
		System.out.println("From test");
	}
	
	doc(){
		System.out.println("called default");
		//ERROR must be there if this removed
	}

}
public class J extends doc{
J(){//super() is placed auto
	//super() is added by compiler as no-arg constructor there in parent//works as there is a connstructor in parent class present 
	System.out.println("B");
}

J(int i){//super not added auto
	this();
	//super(); //ERROR as becomes second stat so super and this can't be used together inside the same constructor to call another constructor to call another constructor as either of the stat becomes second stat then we will get an error //this RULE is applicable only constructor call but can be used anytime for method and var access// if your child class constructor consitsts of this keyword then in that constructor super() keyword will not be auto placed
	System.out.println(i);
}

public static void main(String[] args) {
	new J();
	new J(100);
}
}

