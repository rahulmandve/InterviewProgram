package Number_Array_Program;

public class FindMissingNumberinARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,2,3,5,6};
	
		int n=arr.length + 1;//6
	
		int expectedsum=n*(n+1)/2;//21
	
		int actualsum=0;//17
		for(int num : arr)
		{
			System.out.println(actualsum+=num);
		}
		int missingnum=expectedsum-actualsum;//21-17=4
		System.out.println("Missing number "+missingnum);//missing number is 4
	}

}
