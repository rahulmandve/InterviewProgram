package Number_Array_Program;

public class SecondLargestFinderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {32,6,89,0};

		int largest=-1;
		int secondlargest=-1;
		
		 // Finding the largest element
        for (int i = 0; i < arr.length; i++) {
            if (largest<arr[i])
                largest = arr[i];
        }
        // Finding the second largest element
        for (int i = 0; i < arr.length; i++) {
            if (secondlargest<arr[i]  && arr[i] != largest) {
            	secondlargest = arr[i];
            }
        }
        System.out.println(secondlargest);
	}

}
