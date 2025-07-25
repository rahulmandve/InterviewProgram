package StringProgram;

public class Str_t$m$$rr$$$w {

	public static void main(String[] args) {
		String input="tomorrow";

        StringBuilder output = new StringBuilder();
        int oCount = 0;
        String result="";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'o') {
                oCount++;
                //option--1
                //output.append("$".repeat(oCount)); // Add more $ for each 'o' found
               
                //option---2
                //output.append(result+="$");
                
                //option--3 
                output.append(result=result+"$");
                
			}else {
                output.append(c); // Keep other characters as is
            }
        }

        System.out.println("Transformed output: " + output);
    }
	}


