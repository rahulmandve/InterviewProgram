package JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPI {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Rahul");
		a.add("Maha");
		a.add("Pune");
		a.add("Raj");
	
		
		System.out.println(a);
		
		List<String> l=a.stream().filter(name->name.startsWith("R")).collect(Collectors.toList());
		System.out.println(l);
		
	}
}
