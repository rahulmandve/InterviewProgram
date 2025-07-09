package PattrnProgram;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		for(int i=1;i<=5;i++)
		{
			n=n*10;
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}

}
