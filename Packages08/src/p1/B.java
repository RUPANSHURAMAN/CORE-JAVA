package p1;
/* 
 * Q. Can we import a member(i.e. var and method)?
 * A. Yes, but the member needs to be static i.e. static var and static method.
 * *YOU CAN NEVER import non-static member
 */
import static p2.C.j;

//Adv: 1)Can directly use name of static member

/*
 * 						====>import (For Class)
 * 						|
 * STATIC Packages======|
 * 						|
 * 						====>static import(For static member i.e. method and var)
 * 
 * 
 */

// *STATIC IMPORT: If you want to import static members in your class then we need to use static import

public class B {
	public static void main(String[] args) {
		System.out.println(j); //ERROR if static import order
	}
}
