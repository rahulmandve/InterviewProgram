package JavaPractice;


class demo{
	
	void t1()
	{
		System.out.println("demo t1");
	}
}
public class testde extends demo{
	void t1()
	{
		System.out.println("testde t1 ");
	}
	
	void t2()
	{
		System.out.println("testde t2");
	}
	public static void main(String[] args) {
	
		demo d=new testde();
//		d.t2();
	}

}
