package javaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=4;
		boolean isPrime=true;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
			if(isPrime) {
				System.out.println("the given number is prime");
			}else {
				System.out.println("the given number is not prime ");
			
		}

	}

}
