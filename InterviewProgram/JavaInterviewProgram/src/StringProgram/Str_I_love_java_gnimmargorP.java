package StringProgram;

public class Str_I_love_java_gnimmargorP {

	public static void main(String[] args) {
		//o/p===I love java gnimmargorP capgemin iq
		
		String s="I love java Programming";
		
		String[]arr=s.split(" ");
		String lastword=arr[arr.length-1];
		
		StringBuffer sb=new StringBuffer();

		
		for(int j=0;j<arr.length-1;j++)
		{
			sb.append(arr[j]+" ");
		}
		
		for(int i=lastword.length()-1;i>=0;i--)
		{
			
		sb.append(lastword.charAt(i));
		
		}
		System.out.println(sb);

	}

}
