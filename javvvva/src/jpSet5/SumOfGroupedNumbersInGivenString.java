package jpSet5;

public class SumOfGroupedNumbersInGivenString {

	public static void main(String[] args) {
	String s="15$ab10@";
	// String s="15$ab10@45";
	int sum=0;
	int tSum=0;
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
			int n=s.charAt(i)-48;
			
			sum=sum*10+n;
		}else {
			tSum=tSum+sum;
			sum=0;
		}
		
	}
	   //    tSum=tSum+sum;
			System.out.println(tSum);

	}

}
