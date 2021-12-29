package jpSet1;
//Generate first 5 Fibonacci number
public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		
	
		System.out.print(num1+" ");
		System.out.print  (num2+" ");
		
		for(int i=0;i<3;i++) {
			int num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
		}
	} 
}
		
		

	


