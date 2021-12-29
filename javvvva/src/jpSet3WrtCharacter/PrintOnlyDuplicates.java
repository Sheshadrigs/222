package jpSet3WrtCharacter;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicates {

	public static void main(String[] args) {
		String s ="karnataka";
		//create a set collection
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length();i++) {
			//add all the characters of given string into set
			set.add(s.charAt(i));
		} 
		System.out.println(set);
		
		for (Character ch : set) {
			int count=0;
			
			//step2:: compare each character of SeT with all the characters of given string
			
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i) ) {
					//step3:: if character is matching increment the count
					count++;
					
				}
			}
			//print only duplicates
			if(count>1) {  
			System.out.println(ch+" "+count);
			
			}
			
		}

	}


	}


