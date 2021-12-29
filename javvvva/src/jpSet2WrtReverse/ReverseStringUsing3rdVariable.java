package jpSet2WrtReverse;

public class ReverseStringUsing3rdVariable {

	public static void main(String[] args) {
		///reverse given string with using 3rd variable
		String s="java";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);

	}
}
