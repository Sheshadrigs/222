package jpSet5;

public class FirstCharacterInWordConvertToUppercase {

	public static void main(String[] args) {
		String s="java";
		for(int i=0;i<s.length();i++) {
			if(i==0) {
				String s1=""+s.charAt(i);
				System.out.print(s1.toUpperCase());
			}else {
				System.out.print(s.charAt(i));
			}
		}

	}

}
