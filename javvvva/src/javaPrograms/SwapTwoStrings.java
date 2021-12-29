package javaPrograms;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String s1="shashi";
		String s2="vidya";
		 
		s1=s1+s2; //shashividya
		s2=s1.substring(0, s1.length()-s2.length());//shashi
		s1=s1.substring(s2.length());//vidya
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);

	}

}
