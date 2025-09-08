package StringProgram;

public class convertFirstLetterToUpperCase {
	public static void main(String[] args) {
		String a="Pune";
		String s=a.substring(0, 1).toUpperCase()+ a.substring(1);
		
		System.out.println("Single word=== "+s);
		
		
		String input = "pune city";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
for(String word:words)
{
	if(!word.isEmpty())
	{
		result.append(Character.toUpperCase(word.charAt(0)))
		.append(word.substring(1))
		.append(" ");
	}
}

        System.out.println("Multiple words=="+result.toString().trim()); // Output: Pune City

	}

	
}
