package p2;

public class B {
public static void main(String[] args) {

	// Palindrome check
	String s1 = "madam";
	int count = 0;
	int j = s1.length()-1;
	for(int i=0; i<s1.length(); i++){
		if(s1.charAt(i) == s1.charAt(j--)){
			count++;
		}
	}
	
	if(count==s1.length()){
		System.out.println("Palindrome");
	}else{
		System.out.println("Not Palindrome");
	}
}
}
