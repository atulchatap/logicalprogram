package Logical_program;

public class prog8_reverse_each_wordof_string {
	
	public static void main(String[] args) {
		
		String s1 = "om namah shivay";
		String ar [] =s1.split(" ");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String org = ar[i];
		    String rev = "";
			
		    for(int j=org.length()-1; j>=0; j--)
		    {
		    	rev = rev+org.charAt(j);
		    }
			
			System.out.print(rev+" ");
			
		}
		
		
	}

}
