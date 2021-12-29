package javaPrograms;

public class Palindrome {

	public static void main(String[] args) {
	int n=17671;
	int temp=n;
	int rev=0;
	while(n>0) {
		int dig=n%10;
		rev=rev*10+dig;
		n=n/10;
	}
	if(temp==rev) {
		System.out.println("the given number is palindrome");
		
	}else {
		System.out.println("the given number is not palindrome");
	}
	}

}
