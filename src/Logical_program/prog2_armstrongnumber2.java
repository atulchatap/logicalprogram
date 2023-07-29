package Logical_program;

public class prog2_armstrongnumber2 {

	public static void main(String[] args) {
		
		int orgnum= 371;
		int sum= 0;
		
		for(int i=orgnum; i>0; i= i/10)
		{
			int arm= i%10;
			sum=sum+(arm*arm*arm);
		}
		
		if(orgnum==sum)
		{
			System.out.println("given number "+orgnum+" is armstrong number");
		}
		else
		{
			System.out.println("given number "+orgnum+" is not armstrong number");
		}
	}
	
	
}
