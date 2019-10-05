package NumberFormat;
//* If you want to store hetrogeneous data, then create the array of type Object, no instantiating of individual object is needed
// Object class is a supermost class in java and every class which we create by default is a subclass of Object class
//If you create a var of the type Object it means that you can store any kind of data in it e.g.
public class I {

	public static void main(String[] args) {
		Object[] d = new Object[3];
		
		d[0] = "test";
		d[1] = 10;
		d[2] = 10.4;
		
		for(int i = 0; i<d.length; i++) {
			System.out.println(d[i]);
		}
	}
}
