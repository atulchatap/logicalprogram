package star_pattern;

public class star_diamond {

	public static void main(String[] args) {
		
		int star= 1;
		int space= 3;
		
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			for(int k=1; k<=space; k++)
			{
				System.out.print(" ");
			}
			System.out.println();
			
			if(i<=3)
			{
				star= star+2;
				space= space--;
			}
			else
			{
				star= star-2;
				space=space++;
				
			}
			
			
		}
		
		
	}
	
}
