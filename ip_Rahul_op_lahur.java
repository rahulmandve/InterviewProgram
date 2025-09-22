package StringProgram;

public class ip_Rahul_op_lahur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rahul";
		
		char firstchar=s.charAt(0);
		char lastchar=s.charAt(s.length()-1);
		String midlechar=s.substring(1, s.length()-1);
		
		String result=lastchar+midlechar+firstchar;
		
		System.out.println(result);//lahur
	}

}
