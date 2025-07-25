package StringProgram;

public class StringPattern_restest {
	public static void main(String[] args) {
		
		String input="retest";
		
		for(int i=input.length();i>=0;i--)
		{
			System.out.println(input.substring(0, i));
		}
	}

}
