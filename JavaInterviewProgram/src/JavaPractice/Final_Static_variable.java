package JavaPractice;

public class Final_Static_variable {

	public final int a=10;
	public static int b=20;
	
	int bc=30;
	
	public static void main(String[] args) {
		
		Final_Static_variable f=new Final_Static_variable ();
		Final_Static_variable f1=new Final_Static_variable ();
		Final_Static_variable f2=new Final_Static_variable ();
		Final_Static_variable f3=new Final_Static_variable ();
		
		
		
		System.out.println(f.b);
		System.out.println(f1.b);
		f.b=100;
		System.out.println(f2.b);
		System.out.println(f3.b);
		System.out.println(f.bc);
		
	}

}

