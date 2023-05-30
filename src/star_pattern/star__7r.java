package star_pattern;

public class star__7r {

	public static void main(String[] args) {
		
		int star= 1;
		int space= 6;
		
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			space--;
			star++;
			
			
			System.out.println();
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
}
