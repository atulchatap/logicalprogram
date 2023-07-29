package Logical_program;

import java.util.HashMap;
import java.util.Set;

public class example10_HashMap2_OccuranceOfEachCharInAString {

	public static void main(String[] args) {
		
		String str = "abcab";
		HashMap<Character, Integer> mp = new HashMap<>();
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1 = str.charAt(i);
			
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
			for(Character key:allkey)
			{
				System.out.println(key+"-"+mp.get(key));
			}
			
			System.out.println("------------------");
			
			//print only duplicate chars
			for(Character key:allkey)
			{
				if(mp.get(key)>1)
				{
					System.out.println(key+"-"+mp.get(key));
					
				}
				
			}
			
		}
		
		
		
		
	}
	
	
	

