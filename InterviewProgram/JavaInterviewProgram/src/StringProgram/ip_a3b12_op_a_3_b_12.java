package StringProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ip_a3b12_op_a_3_b_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="a3b12";
		StringBuilder sb=new StringBuilder();
		
		Matcher match=Pattern.compile("([a-zA-Z])(\\d+)").matcher(s);
		
		while(match.find())
		{
			sb.append(match.group(1)).append("-").append(match.group(2)).append(" ");
		}
		
		System.out.print(sb);
	}

}
