package StringProgram;

public class I_love_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Mphasis IQ
		String s1="abc-2019";//
		String []ar=s1.split("-");
		
		System.out.println("["+ar[0]+"]"+"\n"+"["+ar[1]+"]");//output== [abc]
															//			[2019]
		
//		----------------------------------------------------------------------------
		
		String s="I love java";
		StringBuffer sb=new StringBuffer();
		
	
		
		String[]arr=s.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			sb.append(arr[i]+" ");
			
		}
		System.out.println(sb);//output==java love i
//		----------------------------------------------------------------------------------------
		//What is o/p
		
		String st="Rahul";
		st.toUpperCase();
		System.out.println(st);//Rahul
		
//		-------------------------------------------------------------------------------------------
	}

}
