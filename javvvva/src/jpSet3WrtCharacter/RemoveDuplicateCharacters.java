package jpSet3WrtCharacter;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String s ="karnataka";
		//create a set collection
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length();i++) {
			//add all the characters of given string into set
			set.add(s.charAt(i));
		} 
		for (Character ch : set) {
			
			System.out.print(ch);
			
		}
		

	}

}
