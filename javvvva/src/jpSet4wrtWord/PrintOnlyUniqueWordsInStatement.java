package jpSet4wrtWord;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueWordsInStatement {

	public static void main(String[] args) {
		String s ="Welcome To TYSS Welcome To banglore"; 
		String[] str=s.split(" ");
		//create a set collection
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0; i<str.length;i++) {
			//add all the characters of given string into set
			set.add(str[i]);
		} 
		System.out.println(set);
		
		for (String ch : set) {
			int count=0;
			
			//step2:: compare each character of SeT with all the characters of given string
			
			for(int i=0;i<str.length;i++) {
				if(ch.equals(str[i])) {
					//step3:: if character is matching increment the count
					count++;
					
				}
			}
			//step4:: print the both character set and count
			if(count==1) {
			System.out.print(ch+" ");
		
		}

	}

	}

}
