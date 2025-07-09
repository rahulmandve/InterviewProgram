package StringProgram;

public class CharOcceranceInString {
	public static void main(String[] args) {

		String s = "tomorrow";
		char ch = 'o';
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
//			if (Character.isLetter(c)) {
				if (ch == c) {
					count++;
				}
//			}
		}
		System.out.println(ch + " count is " + count);
	}

}
