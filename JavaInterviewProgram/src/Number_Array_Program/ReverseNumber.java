package Number_Array_Program;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int num = 12345;
	     int temp = 0;

	        while (num > 0) {
	            int r = num % 10;
	            temp = temp * 10 + r;
	            num =num/ 10;
	        }

	        System.out.println("Reversed number: " + temp);

	}

}
