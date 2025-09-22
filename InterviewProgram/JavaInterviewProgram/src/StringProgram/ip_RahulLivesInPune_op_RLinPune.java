package StringProgram;

public class ip_RahulLivesInPune_op_RLinPune {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="rahul live in pune";
		String []arr=s.split(" ");
		
		StringBuilder result=new StringBuilder();
		
			if(arr.length>0)
			{
				result.append(arr[0].charAt(0)).append(" ");
			}if(arr.length>1)
			{
				result.append(arr[1].charAt(0)).append(" ");
			}
		
		for(int i=2;i<arr.length;i++)
		{
			result.append(arr[i]+" ");
		}
		System.out.print(result);
	}

}
