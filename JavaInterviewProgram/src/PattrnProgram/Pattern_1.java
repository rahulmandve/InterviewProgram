package PattrnProgram;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*output==  1
				**
				333
				****
				55555
		*/
		
		for(int i=0;i<=5;i++) {
			if(i%2==0)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
			}else {
				for(int s=1;s<=i;s++)
				{
					System.out.print(i);
				}
			}
		
System.out.println();
}
	}
}
