package jpSet2WrtReverse;

public class ReverseStringWithoutUsingLentgh {

	public static void main(String[] args) {
		String s ="java";
		String rev="";
		char[] ch = s.toCharArray();
		int count=0;
		for (char c : ch) {
			count++;
			
		}
		System.out.println(count);
		for(int i=count-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);

	}

}
