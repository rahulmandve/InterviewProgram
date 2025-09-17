package Number_Array_Program;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1*2*3*4*5
		int num = 5; // You can change this to any number
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);

	}

}
