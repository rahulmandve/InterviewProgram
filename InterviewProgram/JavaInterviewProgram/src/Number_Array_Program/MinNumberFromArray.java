package Number_Array_Program;

public class MinNumberFromArray {
	public static void main(String[] args) {
		int arr[]=new int[] {2,12,34,0,21,2};
		int min =arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("min number in array is "+min);
	}

}
