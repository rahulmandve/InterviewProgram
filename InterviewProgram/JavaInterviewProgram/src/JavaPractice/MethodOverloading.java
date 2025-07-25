package JavaPractice;

class parent{
	
	public int m1(int a)
	{
		System.out.println("parent m1 int method ");
		return a;
	}
	public Object m1(String a)
	{
		System.out.println("parent m1 String method");
		return a;
	}
	
	public static void m1(char c)
	{
		System.out.println("parent static m1 method");
	}
	
}
public class MethodOverloading extends parent{
	public String m1(String a)
	{
		System.out.println("child m1 String method");
		return a;
	}
	
	public int m1(int a)
	{
		System.out.println("child m1 int method");
		return a;
	}
	public static void m1(char c)
	{
		System.out.println("child static m1 method");
	}
	public static void main(String[] args) {
		parent p=new parent();
		p.m1(10);
		p.m1("java");
		p.m1('c');
		
		MethodOverloading m= new MethodOverloading();
		m.m1(20);
		m.m1("Python");
		m.m1('c');
		parent p1=new MethodOverloading();
		p1.m1(10);
		p1.m1("Ruby");
		p1.m1('c');
//		MethodOverloading.m1('r');
	}

}

