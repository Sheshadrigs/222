package jpArrays;

import java.util.LinkedHashSet;

public class PrintDuplicateElementsInArray {

	public static void main(String[] args) {
		int [] a= {1,3,2,1,4,3,5};
		
LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0; i<a.length;i++) {
			//add all the characters of given string into set
			set.add(a[i]);
		} 
		
		for (Integer ch : set) {
			int count=0;
			
			//step2:: compare each character of SeT with all the characters of given string
			
			for(int i=0;i<a.length;i++) {
				if(ch.equals(a[i])) {
					//step3:: if character is matching increment the count
					count++;
					
				}
			}
			//step4:: print the both character set and count
			if(count>1) {
			System.out.println(ch+" = "+count);
			
			
			}
		}


	}

}
