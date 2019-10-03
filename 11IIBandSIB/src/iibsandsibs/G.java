package iibsandsibs;

public class G {

	//if you create an object inside IIB you will not get any error but program will halt abruptly
	{
		new G(); //NO ERROR but RTE
	}

	public static void main(String[] args) {
		G b1 = new G();
		System.out.println("From main");
	}
}
