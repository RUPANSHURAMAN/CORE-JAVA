package p1;

/*
 * String: It is a class in JAVA which consists of several built-in methods using which we can manipulate String
 * data easily
 */
public class A {
public static void main(String[] args) {
	String s1 = "PANkaj";
	System.out.println(s1.toLowerCase()); //pankaj
	System.out.println(s1.toUpperCase()); //PANKAJ
	
	// Removing whitespaces from the beg and end of String
	s1 = "  Pankaj  ";
	System.out.println(s1); //__Pankaj__
	System.out.println(s1.trim()); //Pankaj
	
	// Spliting based on delimitter
	s1 = "I want to run";
	String[] s2 = s1.split(" ");
	System.out.println(s2[0]);
	System.out.println(s2[1]);
	System.out.println(s2[2]);
	System.out.println(s2[3]);
	
	// length(): counts the number of letters in a String and give int as O/P
	System.out.println(s1.length());
	String[] s3 = s1.split(" ");
	System.out.println(s3[0].length());
	System.out.println(s3[1].length());
	System.out.println(s3[2].length());
	System.out.println(s3[3].length());
	
	// charAt()
	s1 = "Pankaj";
	System.out.println(s1.charAt(2)); // n
	//System.out.println(s1.charAt(100));//StringIndexOutOfBoundsException
	
	// startsWith(), endsWith()
	s1 = "Pankaj";
	System.out.println(s1.startsWith("p")); //false
	System.out.println(s1.startsWith("Pa")); //true
	System.out.println(s1.endsWith("j")); //true
	System.out.println(s1.endsWith("k")); //false
	System.out.println(s1.endsWith("aj")); //true
	
	// Reverse Print String
	s1 = "testing";
	for(int i=s1.length()-1; i>=0; i--){
		System.out.println(s1.charAt(i));
	}
	
	s1 = "azAZ09";
	System.out.println(s1.codePointAt(0));//97
	System.out.println(s1.codePointBefore(2));//122
	System.out.println(s1.codePointCount(0, 2));//2 //return no of unicode point in specified range
	
	System.out.println(s1.compareTo(s2[1]));//s2=to //-22
	System.out.println(s1.compareToIgnoreCase(s2[1]));//s2=to //-22
	
	System.out.println(s1.concat(s1)); // not changed as//azAZ09azAZ09 =====$#@#$$$ Concat but not change
	System.out.println(s1);//azAZ09
	
	System.out.println(s1.contains("09"));//true
	System.out.println(s1.contentEquals("az"));//false
	System.out.println(s1.equals("az"));//false
	System.out.println(s1.equalsIgnoreCase("az")); //false
	
	System.out.println(s1.copyValueOf(new char[]{'s','a'}));//sa
	System.out.println(s1.copyValueOf(new char[]{'s','a'}, 1, 1)); //a //(char[] data, int offset, int count)
	System.out.println(s1);//azAZ09
	
	System.out.println(s1.getBytes());//[B@15db9742
	char[] ch = new char[2];
	s1.getChars(0, 2, ch, 0);
	System.out.println(ch);//az
	
	System.out.println(s1.indexOf('Z'));//3
	System.out.println(s1.indexOf('Z', 3));//3 //(int ch, int fromIndex)
	System.out.println(s1.indexOf(s1));//0
	System.out.println(s1.indexOf(s1, 0));//0//(String s, int fromIndex)
	System.out.println(s1.intern());//azAZ09
	System.out.println(s1.isEmpty());//false
	System.out.println(s1.lastIndexOf('Z'));//3
	System.out.println(s1.lastIndexOf('Z', 0));//-1 //lastIndexOf(int ch, int fromIndex)
	System.out.println(s1.lastIndexOf("az"));
	System.out.println(s1.lastIndexOf("az", 0));
	
	System.out.println(s1.matches("[a-z]"));//false
	
}
}
