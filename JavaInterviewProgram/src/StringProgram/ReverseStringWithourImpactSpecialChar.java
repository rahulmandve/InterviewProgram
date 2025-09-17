package StringProgram;

public class ReverseStringWithourImpactSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Rahul Mandawe";
		char charray[] = s.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)
		{
			if(charray[i]!=' ')
			{
				sb.append(charray[i]);
			}
		}
		int index=0;
		for(int i=0;i<charray.length;i++)
		{
			if(charray[i]!=' ') {
				charray[i]=sb.charAt(index);
				index++;
			}
		}
		System.out.print(new String(charray));//o/p==ewadn aMluhaR
	}

}
