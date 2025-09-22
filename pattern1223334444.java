package PattrnProgram;

public class pattern1223334444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				for(int k=1;k<=j;k++)
				{
					System.out.print(j);
				}
			}
			System.out.println();
		//o/p
//			
//			1
//			122
//			122333
//			1223334444
		}
	}

}
