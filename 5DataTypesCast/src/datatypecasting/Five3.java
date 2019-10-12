package datatypecasting;

public class Five3 {

	public static void main(String[] args) {
		//compiler does not auto type cast as it needs itself not to be held responsible
		float i = 10.3f; //f or F required as float literal needs else taken as double
		
		//long j = i; //ERROR: Explicit type cast required as smaller data type to bigger but not W/O LOSS of data
		long j = (long)i;
		
		System.out.println(j);
		//Whenever there is loss of data regardless of mem size upcastiing can't happen
	}
}
