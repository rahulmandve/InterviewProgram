package Number_Array_Program;

public class OccerenceOfNumberInArrayWithoutCollection {
	
	public static void main(String args[])
	{
		int arr[]= {3,4,5,6,4,3,2,3};
		
		int repeat[]=new int[arr.length];
		
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					count++;
				}
			}
			if(count==0)
			{
				repeat[c++]=arr[i];
			}
		}
		
		for(int i=0;i<repeat.length;i++)
		{
			int count=0;
			if(repeat[i]>=1 && repeat[i]<=9)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(repeat[i]==arr[j])
					{
						count++;
					}
				}
				
				System.out.println(repeat[i]+" : "+count);
			}
		}
		
	}

}
