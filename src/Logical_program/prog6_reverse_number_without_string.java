package Logical_program;

public class prog6_reverse_number_without_string {

	public static void main(String[] args) {
		
		int num1 = 123456;
		int revnum = 0;
		
		for(int i=num1; i>0; i=i/10)
		{
			int rev = i%10;
			revnum = revnum*10+rev;
		}
		System.out.println(revnum);
	}
	
	
}
