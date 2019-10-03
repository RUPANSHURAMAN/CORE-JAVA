package constructors;

// we can create multiple constructors in the same class provided they are differentiated based on number of args and/or type of args

public class Eight5 {
	Eight5() {

	}

//ERROR we can have multiple constructor, can't be of same arguments type or number
	/*
	 * Eight5(){
	 * 
	 * }
	 */

	Eight5(float i) { // constructor float i and int i vary only on type of arg

	}

	Eight5(int i) {// i is a local var and need to be used only in custroctur
		System.out.println(i);
	}

	public static void main(String[] args) {

	}
}
