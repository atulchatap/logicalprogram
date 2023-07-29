package Logical_program;

public class prog4_reverse_number {
	
	public static void main(String[] args) {
		
		int orgnum = 12345;
		String org = Integer.toString(orgnum);
		String rev = "";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev = rev+org.charAt(i);
		}
		
		int orgrev = Integer.parseInt(rev);
		System.out.println(orgrev);
		

		
		
	}
	

}
