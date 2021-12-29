package jpSet1;

public class SumOfEachDigitGivenNumber {

	public static void main(String[] args) {
	int num=134;
	int sum=0;
	 while(num>0) {
		 int mod = num%10;
		 sum=sum+mod;
		 num=num/10;
	 }
	 System.out.println("Sum of each digit of given number is= "+sum);

	} 

}
