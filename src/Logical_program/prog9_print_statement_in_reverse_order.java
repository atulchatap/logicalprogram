package Logical_program;

public class prog9_print_statement_in_reverse_order {

	public static void main(String[] args) {
		
		String s1 = "velocity 28th jan eve batch";
		String ar[] = s1.split(" ");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+" ");
			
		}
		
		
		
	}
	
	
}
