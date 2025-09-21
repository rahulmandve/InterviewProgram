package Number_Array_Program;

public class Fiboneccis_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstdigit=0;
		int secondigit=1;
		
		for(int i=1;i<=10;i++)
		{
			 System.out.print(firstdigit + " ");
			 
			 int thirddigit=firstdigit+secondigit;
			 firstdigit= secondigit;
			 secondigit=thirddigit;
			
		}
	}

}
