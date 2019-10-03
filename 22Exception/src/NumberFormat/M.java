package NumberFormat;
// for V/S for-each
/*			for				|			for-each											x
 * 1. Works in any java 	|1. works only with arrays									------------		  |100 |
 * 		stmts				|											for-each 		|	1000   |--------->|1000|
 * 2. Read/write into array |2.Read value from array									------------		  | 10 |
 * 3. increment/decrement 	|3.increment sequentially						
 * 		access in array		|
 */
public class M {

	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 10;
		a[1] = 100;
		a[2] = 1000;
		
		for(int x:a) { //int x should match with array data type
			System.out.println(x);
		}
	}
}
