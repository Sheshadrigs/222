package jpSet1;

public class SwapTwoWordsWithout3rdVariable {

	public static void main(String[] args) {
		String s1="java";
		String s2="selenium";
		
		s1=s1+s2; //javaselenium
		s2=s1.substring(0, s1.length()-s2.length()); //java
		s1=s1.substring(s2.length());   //selenium
		
System.out.println("s1="+s1);
System.out.println("s2="+s2);
	}

}
