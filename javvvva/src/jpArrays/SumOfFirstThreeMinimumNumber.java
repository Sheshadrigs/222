package jpArrays;

public class SumOfFirstThreeMinimumNumber {

	public static void main(String[] args) {
		int [] a= {20,40,10,50,30};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<3;i++) {
			sum=sum+a[i];
     }
		System.out.print("sum of first three minimum number="+sum);
	}

}
