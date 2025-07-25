package StringProgram;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="madam";
		String temp="";

		for(int i=input.length()-1;i>=0;i--)
		{
			temp+=input.charAt(i);
		}
		if(input.equals(temp)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
	}

}
