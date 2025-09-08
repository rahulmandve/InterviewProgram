package JavaPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		map.put('c', 0);
		map.put('r', 3);
		map.put('a', 5);
		System.out.println("containsKey method==>"+map.containsKey('c'));;//true
		System.out.println(map.containsValue(3));//true
		System.out.println(map.isEmpty());//false
//		System.out.println(map.remove('c', 1));//will remove ('c', 1) this entry
		System.out.println(map.replace('r', 3, 30));//will replace r value with 30
		System.out.println(map.size());//2
		System.out.println(map.get('a'));//5
		System.out.println(map.getOrDefault('z',null));//null
		System.out.println(map.entrySet());//[a=5, r=30]
		System.out.println(map.keySet());//[a, r]
		System.out.println(map);
		System.out.println("---------------------------------------");
		LinkedHashMap<Character, Integer> lmap=new LinkedHashMap<Character, Integer>();
		lmap.put('c', 1);
		lmap.put('r', 3);
		lmap.put('a', 5);
		
		System.out.println(lmap);
			for(Map.Entry<Character, Integer> m:lmap.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		
		
	}

}
