package Logical_program;

import java.util.HashMap;
import java.util.Set;

public class example10_HashMap1_methods {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mp = new HashMap<>();
		
		mp.put(101, "atul");    //key , value
		mp.put(102, "amol");
		mp.put(103, "ajay");
		mp.put(104, "ashok");
		System.out.println(mp);
		
		mp.put(103, "ramesh");    //to update value of the key
		System.out.println(mp);
		
		System.out.println(mp.containsKey(105));   //to check contains key
		
		System.out.println(mp.get(101));     // to get key value
		
		Set<Integer> allkey = mp.keySet();
		
		for(Integer key:allkey)
		{
			System.out.println(key);
		}
		
		for(Integer key:allkey)
		{
			System.out.println(key + "-"+ mp.get(key));
			
		}
			
	}
	
}
