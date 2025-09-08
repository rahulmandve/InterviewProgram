package JavaPractice;

class  parent2{
	
	String name;
	int roll;
	 parent2(String name,int roll){
		this.name=name;
		this.roll=roll;
	}
}


public class Constractor extends parent2{

	
	int age;
	String scool;
	Constractor(String name,int roll,int age,String scool)
	{
		super(name,roll);
		this.age=age;
		this.scool=scool;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Constractor c=new Constractor("rahul",101,35,"mssd");
	}

}
