package p1;

public class E {
	public static void main(String[] args) {
		//									s1,s2,s4	s3
		String s1 = "xyz"; // ------------->|=====|	 |=======|
							// 				| xyz |	 |	xxx	 |
		//								    |=====|	 |=======|
		//									   $ $		$
		String s2 = "xyz"; //------------------| |		|
										//		 |		|
		String s4 = "xyz";// ---------------------		|
		//												|
		String s3 = "xxx";//-----------------------------
		
		// s1, s2, and s4: assigned as used same syntax
		System.out.println(s1==s2); //true
		System.out.println(s2==s4); //true
		System.out.println(s3==s2); //false
	}
}
