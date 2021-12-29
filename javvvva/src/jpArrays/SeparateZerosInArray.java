package jpArrays;

public class SeparateZerosInArray {

	public static void main(String[] args) {
		int[] a= {1,0,2,0,3,0,4,0};
		
		int[] b= new int[a.length];
		
		int m=0;
		int n=a.length-1;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				b[n]=a[i];
				n--;
			}
			else {
				b[m]=a[i];
				m++;
			}
		}
		for(int k=0;k<b.length;k++) {
			System.out.print(b[k]);
		}

	}

}
