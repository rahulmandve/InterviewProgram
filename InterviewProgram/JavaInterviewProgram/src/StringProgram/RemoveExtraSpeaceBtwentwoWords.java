package StringProgram;

public class RemoveExtraSpeaceBtwentwoWords {
	public static void main(String[] args) {
		
		String s="java              is  programming  language";
		
		String fs=s.replaceAll("\\s+", " ");
		
		System.out.print(fs);//java is programming language
	}

}
