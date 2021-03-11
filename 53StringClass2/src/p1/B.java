package p1;

// Q. Biggest word in a given string
public class B {
public static void main(String[] args) {
	String s1 = "my name is rupanshu raman";
	String[] words = s1.split(" ");
	
	int maxWordIndex = 0;
	for(int i=1; i<words.length; i++){
		if(words[maxWordIndex].length() < words[i].length()){
			maxWordIndex = i;
		}
	}
	
	System.out.println("Maxword in: "+words[maxWordIndex]);
}
}
