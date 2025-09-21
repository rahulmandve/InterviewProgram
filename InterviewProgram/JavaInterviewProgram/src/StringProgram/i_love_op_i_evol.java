package StringProgram;

public class i_love_op_i_evol {
public static void main(String[] args) {
	String input = "i love rahul";
    String[] words = input.split(" ");
    StringBuilder output = new StringBuilder();

    for (String word : words) {
        output.append(new StringBuilder(word).reverse()).append(" ");
    }

    System.out.println(output.toString().trim());

}
}
