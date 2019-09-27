package DataTypes;

public class Three4{
static int i; // can be accessed in three ways 1) by ref var 2) w/o ref var 3) directly

public static void main(String[] args) {
	Three4 t4 = new Three4();
	System.out.println(t4.i); //static var can be accessed by ref var but warn, when run <t4> is replaced by <class-name>
	System.out.println(i);
	System.out.println(Three4.i);
	
}
}
