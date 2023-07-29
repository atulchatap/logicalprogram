package Logical_program;

public class practice_armstrong_number {
	
	public static void main(String[] args) {
		
		int num1 = 372;
		int sum = 0;
		
		for(int i=num1; i>0; i=i/10)
		{
			int n1 = i%10;
			sum = sum+ (n1*n1*n1);
		}
		
		if(num1==sum)
		{
			System.out.println("given number "+num1+" is armstrong number");
		}
		else
		{
			System.out.println("given number "+num1+" is not armstrong number");
		}
		
	}

	
}
