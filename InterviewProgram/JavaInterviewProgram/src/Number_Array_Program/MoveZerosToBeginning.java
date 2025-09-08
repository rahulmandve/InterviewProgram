package Number_Array_Program;

import java.util.Arrays;

public class MoveZerosToBeginning {
	public static void main(String[] args) {
		
		int[] arr = {0, 3, 0, 1, 0, 12, 2};
		int n = arr.length;
        int index = n - 1;
        System.out.println("Original array: " + Arrays.toString(arr));
        // Traverse the array from end and move non-zero elements to the end
        for (int i = index; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index--] = arr[i];
                
            }
        }
        while (index >= 0) {
            arr[index--] = 0;
            
        }

	        System.out.println("Modified array: " + Arrays.toString(arr));


	}

}
