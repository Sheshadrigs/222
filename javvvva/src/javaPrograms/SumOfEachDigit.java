package javaPrograms;

public class SumOfEachDigit {

	public static void main(String[] args) {
		int n=135;
		int sum=0;
		
		while(n>0) {
			int mod=n%10;
			sum=sum+mod;
			n=n/10;
		}
		System.out.print(sum);

	}

}
