package Number_Array_Program;

import java.util.HashMap;
import java.util.Map;

public class ElementRepated2ormoreTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {4,4,3,6,5,4,1,1,2,3};
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		for(int num:arr)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>=2)
			{
				System.out.println(entry.getKey());
			}
		}

	}

}
