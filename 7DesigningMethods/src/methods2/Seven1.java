
package methods2;

//Designing methods part 2
public class Seven1 {
	public static void main(String[] args) {
		Seven1 s1 = new Seven1();// 1
		s1.test();// 2
	}// 5

	public void test() {
		System.out.println("test");// 3
		
		/* return keyword 
		 * 
		 * 1. returns the control of the method back to the place from where its called 
		 * 2. when we use only return keyword make sure that the method is of the type void 
		 * 3. return keyword should be the last statement inside a method 
		 * 4. if there are some stat's immediately after return keyword then those stat's will never execute and
		 *    hence we will get an error of unreachable code 
		 * 5. compiler auto places it at end of method but not if return type of method is other than void
		 */
		
		return; // 4 
		//not mandat to write it, should be not written as written by compiler, why take the risk 
		// it transfers control to the caller method, and be at end of method 
		
		// System.out.println("h"); //ERROR as unreachable code
	}
}
