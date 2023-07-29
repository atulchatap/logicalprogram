package Logical_program;

import java.util.HashMap;
import java.util.Set;

public class example10_HashMap2_OccuranceOfEachStringInStatement4 {

	public static void main(String[] args) {
		
		String str = "my name is atul and my home is pune";
		String[] spl = str.split(" ");
		
		HashMap<String, Integer> mp = new HashMap<>();
		
		for(int i=0; i<=spl.length-1; i++)
		{
			String s1 = spl[i];
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);			}
			else
			{
				mp.put(s1, 1);
			}
			
		}
		Set<String> allkeys = mp.keySet();
		
		for(String key:allkeys)
		{
			System.out.println(key+"-"+mp.get(key));
		}
		
		
	}
	
	
	
	
}
