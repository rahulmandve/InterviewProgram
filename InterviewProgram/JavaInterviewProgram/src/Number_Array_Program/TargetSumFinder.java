package Number_Array_Program;

public class TargetSumFinder {

	public static void main(String[] args) {
		

		int[] arr = {1, 4, 44, 21, 2};
        int target = 23;

        System.out.println("Pairs with sum " + target + ":");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j]);
                }
            }
        }

	}

}
