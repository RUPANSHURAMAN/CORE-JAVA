/*
 * * locating javac in commmand prompt window:
 * c:/user/rupanshu>javac
 * 		"javac" is not recognized as internal or external command
 * 
 * To locate javac change the current path to jdk bin path using cd as shown below:
 * c:/user/rupanshu>cd c:/programfiles/java/jdk/bin
 * c:/programfiles/java/jdk/bin[java compiler path]>javac....
 * 
 * 
 * [OR]
 * 
 * Second way to locate compiler in cmd window
 * c:/user/rupanshu>set path=c:/programfiles/java/jdk/bin [not in dowuble quotes]
 * c:/user/rupanshu>javac
 * 
 * Note: when you set the path to locate javac compiler in cmd using cd or SET PATH then it will set the path 
 * tempororily per window.
 * 
 * * Setting up the path to locate javac permanently
 * 		1. Got to env var> system var> path variable and click on edit and set path starting 
 * 				with ; ending with ; as shown below:
 * 				;c:/programfiles/java/jdk/bin;
 * 
 * 		2. open a NEW cmd window and type javac
 * 
 * ALL this is TO LOCATE JAVA COMPILER
 * 
 * 
 * To compile and get .class file:
 * c:/user/rupanshu>javac D;/app/src/A.java	
 * 			gives A.class file in the same folder where java file is present
 * 
 * 
 * =========================================
 *		JDK			|			JRE
 *	 1. used by dev | 1. used by customer
 *	 2. It can 		| 2. It can run .class 
 *	 	compile java|    file
 *	    file		|	  
 *	=========================================
 *	
 *	Q. Can we compile empty class file?
 *	A. Yes
 *	
 *	Q. Can we run empty class file?
 *	A. No
 *	
 * ==================
 * RUNNING .CLASS FILE
 * 	To run a .class file Change the path to the folder where .class file is present
 *  To run a .class file its mandat that you have JRE
 *  
 * c:/liton>javac d;/app/src/A.class
 * c:/> D:
 * D:/cd app/src
 * D:/app/src> java A [should not be .class at end]
 * D:/cd app/src> 
 * 
 * Note: Not mandat to store name of the same file name as class name. To compile it classname.class not
 * filename.class
 * 
 * e.g. javac D:/cd app/src/Z.java
	
 * =======================
 * CLASSPATH= path of .class file
 * In the notepad create the following 3 classes
 * A{} B{} C{} classes and when you compile it you get following files A.class B.class and C.class
 * 
 * D:/cd app/src> javac G.java
 * give C.class [so not same name needed as of class name]
 * 
 * COMPILE ALL FILE AT once
 * D:/cd app/src> javac D:/app/src/*.java
 * 		
 */
public class A {

}
