package datatypecasting;

public class Five5 {
public static void main(String[] args) {
	long i = 100;
	byte j = (byte)(int)i;//PERFECTLY LEGAL as first converted to int then byte
	System.out.println(j);
}
}
