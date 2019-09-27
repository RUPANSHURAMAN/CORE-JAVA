package throws1;

public class G {

	public static void main(String[] args) throws Exception{
		E e1 = new E();
		
		e1.test(); //No need to surround in try catch as main is throws Exception to callr of main() which is JVM which not handles exception and halts the pgm
		System.out.println("From B"); //NOt printed as Exception not handled
		
	}
}
