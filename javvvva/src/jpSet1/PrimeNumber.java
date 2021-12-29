package jpSet1;

public class PrimeNumber {
	public static void main(String[]args) {
		
		int num=9;
		boolean isPrime=true;
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
			if(isPrime) {
				System.out.println("given number is a prime number");
			}else {
				System.out.println("given number is not prime number");
			}
		} 
		
		
	}


