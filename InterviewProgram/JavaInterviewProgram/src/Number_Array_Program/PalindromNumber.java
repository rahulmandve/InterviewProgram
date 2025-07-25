package Number_Array_Program;

public class PalindromNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//A palindrome number is a number that remains the same when its digits are reversed
		
		int n=121,r,sum=0,temp=n;
		
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==temp) {
System.out.println("Palindrome");

	}else
	{
		System.out.println("Not Palindrome");}
	}

}
