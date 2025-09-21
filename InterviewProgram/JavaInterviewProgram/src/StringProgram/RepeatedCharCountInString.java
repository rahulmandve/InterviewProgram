package StringProgram;

import java.util.HashMap;

public class RepeatedCharCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="tomorrow";
		
		HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(!hm.containsKey(ch))
			{
				hm.put(ch, 1);
			}
			else {
				hm.put(ch, hm.get(ch)+1);
			}
		}
		
System.out.println(hm);
	}

}
