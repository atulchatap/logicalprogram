package REVERSE_STRING;

public class palindrom2 {

	
	public static void main(String[] args) {
		
		String name= "madam";
		String rev= "";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			rev= rev+name.charAt(i);
		}
		System.out.println("given string reverse= "+ rev );
		
		if(name.equals(rev))
		{
			System.out.println("string is palindrom");
		}
		else
		{
			System.out.println("string is not palindrom");
		}
			
			
	}
}
