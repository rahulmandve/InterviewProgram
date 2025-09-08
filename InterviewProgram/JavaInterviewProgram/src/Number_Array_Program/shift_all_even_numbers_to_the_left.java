package Number_Array_Program;

public class shift_all_even_numbers_to_the_left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2, 5, 8, 7, 1, 3, 6, 4, 5, 9};
		int n = arr.length;
        int index = n - 1;
		
		for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i]%2!= 0) {
                arr[index] = arr[i];
                index--;
                System.out.print(arr[i]);
            }
            	
          
        }

	}

}
