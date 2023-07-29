package Logical_program;

public class findtotal_no_of_white_space {
	
	public static void main(String[] args) {
		
		String abc = "a b  c d";
		int count= 0;
		
		for(int i=0; i<=abc.length()-1; i++)
		{
			char s1 = abc.charAt(i);
		
		 if(s1==' ')
		 {
			count++;	
		 }
		}
		
		System.out.println("total no of white space in abc is "+count);
		
	}

}
