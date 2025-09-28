package StringProgram;

public class CharOccerenceInStringWithoutCollection {

	public static void main(String[] args) {
		String str="programmming";
		
		char arr[]=new char[str.length()];
		
		int c=0;
		
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j) && i!=j)
				{
					count++;
				}
			}
			if(count==1)
			{
				arr[c++]=str.charAt(i);
				
				System.out.println(str.charAt(i));
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z'))
			{
				for(int j=0;j<str.length();j++)
				{
					if(arr[i]==str.charAt(j))
					{
						count++;
					}
				}
				System.out.println(arr[i]+" : "+count);
			}
		}
	}
}
