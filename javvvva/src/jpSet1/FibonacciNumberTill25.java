package jpSet1;

public class FibonacciNumberTill25 {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
	    int n=25;
	    
		System.out.print(num1+ "  ");
		System.out.print(num2+"  ");
		
		for(int i=0;i<25;i++) {
			int num3=num1+num2;
			
			if(num3>=n) {
				break;
			}
			System.out.print(num3+"  ");
			num1=num2;
			num2=num3;
		}
	
	}

}
