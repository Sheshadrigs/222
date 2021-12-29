package jpSet1;

public class Palindrome {

	public static void main(String[] args) {
		
	  int n=34543;
	  int temp=n; 
	  int rev=0;
	  
	  while(n>0) {  
		  int dig=n%10;
		  rev=rev*10+dig;
		  n=n/10;
	  }
	  if(rev==temp) {
		  System.out.println(temp+ "is a palindrome");
	  }else {
		  System.out.println(temp+ "is not a palindrome");
	  }

	}

}
