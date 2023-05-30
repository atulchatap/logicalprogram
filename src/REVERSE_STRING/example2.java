package REVERSE_STRING;

public class example2 {

	public static void main(String[] args) {
		
		String name= "atul chatap";		
		String rev= "";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}
	
	
	
	
}
