package p1;

/*
 * Printing right angled triangle
 */
public class A {
	public static void main(String[] args) {
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(i>j){
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
}
