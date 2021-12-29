package jpSet2WrtReverse;

public class ReverseString {

	public static void main(String[] args) {
		String s="java";
	//reverse given string without using 3rd variable	
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
 }
}
