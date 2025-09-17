package StringProgram;

public class Specific_Word_count {
	
	public static void main(String[] args) {
		
		String s="India is my countr is my country is india";
		String search="is";
		int count=0;
		String []arr=s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].contains(search))
			{
				count++;
			}
		}
		System.out.println("Is count==="+count);
		
	}

}
