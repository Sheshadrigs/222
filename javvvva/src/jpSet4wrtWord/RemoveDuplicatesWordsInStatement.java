package jpSet4wrtWord;

import java.util.LinkedHashSet;

public class RemoveDuplicatesWordsInStatement {

	public static void main(String[] args) {
		String s ="Welcome To TYSS Welcome To banglore"; 
		String[] str=s.split(" ");
		//create a set collection
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0; i<str.length;i++) {
			//add all the characters of given string into set
			set.add(str[i]);
		} 
				 //remove Duplicates
		for (String ch : set) {
			System.out.print(ch+" ");
			
	}

}
}
