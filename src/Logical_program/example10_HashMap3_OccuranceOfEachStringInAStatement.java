package Logical_program;

import java.util.HashMap;
import java.util.Set;

public class example10_HashMap3_OccuranceOfEachStringInAStatement {

	public static void main(String[] args) {
		
		String str = "my name is abc is abc";
		String ar []=str.split(" ");
		
		HashMap<String, Integer> mp = new HashMap<>();
		for(int i=0; i<=ar.length-1; i++)
		{
			String s1 = ar[i];
			
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1, 1);
			}
			
		}
		
		  Set<String> allkey = mp.keySet();
		
		  for(String key:allkey)
		  {
			  System.out.println(key+"-"+mp.get(key));
		  }
		  
		  for(String key:allkey)
		  {
			  if(mp.get(key)>1)
			  {
				  System.out.println(key+"-"+mp.get(key));
			  }
			  
		  }
			  
		  
	}
	
	
}
