package StringProgram;

public class printHightOccerencChar {
	
	 public static void main(String[] args) {
	        String input = "adebbbbwwwwwqq";
	        char maxChar = input.charAt(0);
	        int maxCount = 1;

	        char currentChar = input.charAt(0);
	        int currentCount = 1;

	        for (int i = 1; i < input.length(); i++) {
	            if (input.charAt(i) == currentChar) {
	                currentCount++;
	            } else {
	                currentChar = input.charAt(i);
	                currentCount = 1;
	            }

	            if (currentCount > maxCount) {
	                maxCount = currentCount;
	                maxChar = currentChar;
	            }
	        }

	        // Print the character repeated maxCount times
	        for (int i = 0; i < maxCount; i++) {
	            System.out.print(maxChar);
	        }
	    }


}
