package StringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatCharFromString {
	
	public static void main(String args[])
	{
		
		String s="programming";
		StringBuilder b=new StringBuilder();
		Set<Character> hs= new LinkedHashSet<Character>();
		for(char ch:s.toCharArray())
		{
			if(hs.add(ch))
			{
				b.append(ch);
			}
		}
		System.out.println(b);
	}

}
