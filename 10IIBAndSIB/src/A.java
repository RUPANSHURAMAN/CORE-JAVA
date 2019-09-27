
public class A {
//IIB = INSTANCCE INITIALIZATION BLOCK = IB's are executed when objects are created // number of times we create the object same number of times IIB will be called //IIB are used to initialize all the instance vars in one place //and that gives us better readabilty of the code
	
	{
		System.out.println("A"); //NOT PRINTED as object not created and so IIB will not be called
	}
	public static void main(String[] args) {
		
	}
}
