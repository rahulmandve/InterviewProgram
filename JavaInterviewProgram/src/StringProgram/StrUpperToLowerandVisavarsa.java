package StringProgram;

public class StrUpperToLowerandVisavarsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="rAHuL";//o/p----RahUl
		StringBuilder sb=new StringBuilder();
//		
//		for(char ch : s.toCharArray())
//		{
//			if(Character.isUpperCase(ch))
//			{
//				sb.append(Character.toLowerCase(ch));
//			}else if(Character.isLowerCase(ch))
//			{
//				sb.append(Character.toUpperCase(ch));
//			}
//		}
//		System.out.println(sb);
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				sb.append(Character.toLowerCase(ch));
			}else if(Character.isLowerCase(ch))
			{
				sb.append(Character.toUpperCase(ch));
				
			}
		}
		System.out.println(sb);
	}

}
