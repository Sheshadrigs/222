package javaPrograms;

public class Factorial {

	public static void main(String[] args) {
		int n=3;
		int fact=1;
		while(n>0) {
			fact=fact*n;n--;
		}
		System.out.print(fact);

	}

}
