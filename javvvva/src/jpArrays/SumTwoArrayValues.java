package jpArrays;

public class SumTwoArrayValues {

	public static void main(String[] args) {
		int a[]= {1,3,5,1,6};
		int b[]= {4,8,4,3};
		
		int count =a.length;
		if(a.length<b.length) {
			count=b.length;
		}
		for(int i=0;i<count;i++) {
			try {
				System.out.println(a[i]+b[i]);
			}
			catch(Exception e) {
				if(a.length<b.length) {
					System.out.println(b[i]);
				}else {
					System.out.println(a[i]);
				}
			}
		}
		

	}

}
