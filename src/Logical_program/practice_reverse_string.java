package Logical_program;

public class practice_reverse_string {

	public static void main(String[] args) {
		
		String str = "atul chatap";
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			
			rev= rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		
	}
	
	
}
