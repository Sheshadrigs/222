package javaPrograms;

public class FebbocacciNumber {

	public static void main(String[] args) {
      
		int n1=0;
		int n2=1;
		
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		
		for(int i=0;i<3;i++) {
			int n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}

}
