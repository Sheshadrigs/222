package javaPrograms;

public class fabocacciTill25 {

	public static void main(String[] args) {
	//fabocacciTill25
		int n1=0;
		int n2=1;
		
		System.out.print(n1+"  ");
		System.out.print(n2+"  ");
		
		for(int i=0;i<25;i++) {
			int n3=n1+n2;
			if(n3>=25) {
				break;
				
			}
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			
		}

	}

}
