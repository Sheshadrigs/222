package jpSet5;

public class ReverseTheStatement {

	public static void main(String[] args) {
		String s="Welcome to TYSS";
		String rev="";
		String[] str=s.split(" ");
		
		for(int i=str.length-1;i>=0;i--) {
			rev=rev+str[i]+" ";
			
		}
		System.out.println(rev);

	}

}
