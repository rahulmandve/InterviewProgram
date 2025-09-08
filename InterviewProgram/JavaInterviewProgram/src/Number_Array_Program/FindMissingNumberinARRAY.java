package Number_Array_Program;

import java.util.HashSet;

public class FindMissingNumberinARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1, 2, 3, 4, 6, 7, 9};
		int start = arr[0];
        int end = arr[arr.length - 1];

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        
        System.out.print("Missing numbers: ");
        
        for (int i = start; i <= end; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }

//        for (int i = start; i <=end; i++) {
//            if (!contains(arr, i)) {
//                System.out.print(i + " ");
//            }
//        }
	}
//	public static boolean contains(int[] arr, int num) {
//        for (int val : arr) {
//            if (val == num) return true;
//        }
//        return false;
//    }

}
