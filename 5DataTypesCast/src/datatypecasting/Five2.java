package datatypecasting;
//2) Explicit downcasting: 
public class Five2 {

	public static void main(String[] args) {
		long i = 10;
		//byte j = i; //ERRROR as not explicitly type casted
		byte j = (byte)i; //NO ERROR NOW
		System.out.println(j);
	}
}
