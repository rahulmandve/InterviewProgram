package JavaPractice;

class parent1 {
	public void m1() {
		System.out.println("parent m1 method");
	}
}

public class Inheritance extends parent1{

	
	public void test()
	{
		System.out.println("child test method");
	}
	
	public static void main(String[] args) {
		
		parent1 p1=new parent1();
		p1.m1();
System.out.println("-------------------------------------------------");
		Inheritance i=new Inheritance();//if method is overriden then will call child class method
		i.test();					
		i.m1();
		System.out.println("-------------------------------------------------");
		parent1 p2=new Inheritance();
		p2.m1();
		System.out.println("-------------------------------------------------");

	}

}
