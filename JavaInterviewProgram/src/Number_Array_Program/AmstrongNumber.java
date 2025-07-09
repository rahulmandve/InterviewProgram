package Number_Array_Program;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1*1*1=1
		//5*5*5=125
		//3*3*3=27
		
		int n=153,r,sum=0,temp=n;
		
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==temp) {
System.out.println("amstrong");

	}else
	{
		System.out.println("Not amstrong");}
	}

}
