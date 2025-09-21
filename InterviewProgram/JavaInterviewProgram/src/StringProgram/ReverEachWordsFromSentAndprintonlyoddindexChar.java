package StringProgram;

public class ReverEachWordsFromSentAndprintonlyoddindexChar {
	public static void main(String args[]) {

		String s = "Java is a Programming language";

		String arr[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String words : arr) {
			for (int i = words.length() - 1; i >= 0; i--) {
				sb.append(words.charAt(i));

			}
			sb.append(" ");
		}

		String sn = new String(sb).trim();
		
		String revarr[]=sn.split(" ");
		StringBuilder s1=new StringBuilder();
		for(String ar:revarr)
		{
			for(int i=0;i<ar.length();i++)
			{
				if(i%2!=0)
				{
					s1.append(ar.charAt(i));
				}
			}
			s1.append(" ");
		}
		System.out.println("s1 "+s1);// vJ i  nmagr gunl 
		
		
		System.out.println(sn);//o/p=== avaJ si a gnimmargorP egaugnal
		StringBuilder sb1 = new StringBuilder();

		for (int i = 0; i < sn.length(); i++) {
			if (i % 2 != 0) {
				sb1.append(sn.charAt(i));
			}
		}

		System.out.println(sb1);//o/p==vJs  nmagr gunl
	}

}