package Logical_program;

import java.util.HashMap;
import java.util.Set;

public class example10_HashMap2_OccuranceOfEachCharInAString2 {

	public static void main(String[] args) {
		
		String str = "atultul";
		
		HashMap<Character, Integer> mp = new HashMap<>();
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1 =str.charAt(i);
			
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1, 1);
			}
		}
		
		Set<Character> allkey = mp.keySet();
		
		for(Character keys:allkey)
		{
			System.out.println(keys+"-"+mp.get(keys));
		}
		for(Character keys:allkey)
		{
			if(mp.get(keys)<2)
			{
				System.out.println(keys+"-"+mp.get(keys));
			}
			
		}
		
	}
	
	
	
}
