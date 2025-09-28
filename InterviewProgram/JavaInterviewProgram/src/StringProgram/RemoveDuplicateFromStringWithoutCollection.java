package StringProgram;

public class RemoveDuplicateFromStringWithoutCollection {
	
	public static void main(String[] args) {
		
		String s="programming skill";
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j) && (i!=j))
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(s.charAt(i));
			}
		}
	}

}
