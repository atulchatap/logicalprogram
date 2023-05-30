package REVERSE_STRING;

public class reverse1 {

	public static void main(String[] args) {
		
		String name= "shahrukh";
		String rev= "";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			rev= rev+name.charAt(i);
			
		}
		System.out.println("original string = "+name);
		System.out.println("reverse string = "+rev);
		
		
	}
	
	
	
	
}
