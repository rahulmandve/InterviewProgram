package Number_Array_Program;

public class SecondLargestFinderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {32,6,89,4,3,25,96,1};

		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		
		for(int num:arr)
		{
			if(num>largest)
			{
				secondlargest=largest;
				largest=num;
			}else if(num>secondlargest && num!=largest)
			{
			secondlargest=num;
			}
		}
		if (secondlargest == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest element found.");
        } else {
            System.out.println("Second largest element: " + secondlargest);
        }

	}

}
