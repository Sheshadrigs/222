package jpArrays;

public class StringValueHavingMinimum {

	public static void main(String[] args) {
		String [] str= {"hi","find","javac","n","two","mango"};
		String min=str[0];
		
		for(int i=1;i<str.length;i++) {
			if(min.length()>str[i].length()) {
				min=str[i];
			}
		}
		for(int i=0;i<str.length;i++) {
			if(min.length()==str[i].length()) {
				System.out.print(str[i]);
			}
		}

	}

}
