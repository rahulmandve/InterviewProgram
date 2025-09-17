package StringProgram;

public class TomorrowTo_t3m3223w {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "tomorrow";
        StringBuilder sb = new StringBuilder();

        for (char ch : input.toCharArray()) {
            switch (ch) {
                case 'o':
                	sb.append('3');
                    break;
                case 'r':
                	sb.append('2');
                    break;
                default:
                	sb.append(ch);
            }
	}
        System.out.println("Transformed output: " + sb.toString());

}
	}
