package Logical_program;

public class prog5_reverse_string {

	public static void main(String[] args) {
		
		String name = "atul chatap";
		String rev = "";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			rev = rev+name.charAt(i);
		}
		
		System.out.println(rev);
		
	}
	
}
