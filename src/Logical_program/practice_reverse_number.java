package Logical_program;

public class practice_reverse_number {

	public static void main(String[] args) {
		
	
	int num = 6789;
	int rev =0;
	
	for(int i=num; i>0; i=i/10)
	{
		int revnum = i%10;
	    rev= rev*10+revnum;
	}
	System.out.println(rev);
	
	}
	
	
}
