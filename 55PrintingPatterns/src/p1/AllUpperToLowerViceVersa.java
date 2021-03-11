package p1;

public class AllUpperToLowerViceVersa {
	public static void main(String[] args) {
		String input = "Rupanshu";
		
		//Main Logic starts--
		char[] arrays = input.toCharArray();
		
		for (int i = 0; i < arrays.length; i++) {
			char ch = arrays[i];
			if(ch>='A' && ch<='Z'){ //If Uppercase between A to Z check
				ch = (char) ('a' + (ch-'A')); //small 'a' + diff to go to that char in small
			}else{//else Lowercase
				ch = (char) ('A' + (ch-'a'));
			}
			arrays[i] = ch;
		}
		
		input = new String(arrays);
		//MAIN LOGIC ENDS----
		
		System.out.println(input);
	}
}
