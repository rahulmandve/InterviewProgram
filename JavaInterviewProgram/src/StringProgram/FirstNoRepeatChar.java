package StringProgram;

public class FirstNoRepeatChar {
	
	public static String firstnonRepeatedChar(String s)
	{
		String result="";
		for(int i=0;i<s.length();i++) {
			int count=0;
	
				for(int j=0;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j) && i!=j) {
						count++;
						break;
					}
						
				}
				if(count==0)
				{
					//result +=s.charAt(i);
					result =result+s.charAt(i);
							break;
				}
			
	}
		return result;
	}
	public static void main(String[] args) {
		System.out.print(firstnonRepeatedChar("ooptr"));
	}

}
